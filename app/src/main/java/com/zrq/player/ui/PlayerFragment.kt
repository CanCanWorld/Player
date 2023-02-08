package com.zrq.player.ui

import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.tabs.TabLayoutMediator
import com.google.gson.Gson
import com.zrq.player.adapter.DetailAdapter
import com.zrq.player.bean.Detail
import com.zrq.player.bean.PlayUrl
import com.zrq.player.databinding.FragmentPlayerBinding
import com.zrq.player.utils.Constants.BASE_URL
import com.zrq.player.utils.Constants.DANMAKU
import com.zrq.player.utils.Constants.DETAIL
import com.zrq.player.utils.Constants.PLAY_URL
import com.zrq.player.utils.HttpUtil.httpGet
import com.zrq.player.utils.HttpUtil.httpXmlGet
import com.zrq.player.view.video.MyDanmakuView
import com.zrq.player.view.video.MyGestureView
import com.zrq.player.view.video.MyVodControlView
import org.xml.sax.InputSource
import xyz.doikki.videocontroller.StandardVideoController
import xyz.doikki.videocontroller.component.*
import xyz.doikki.videoplayer.player.BaseVideoView
import xyz.doikki.videoplayer.player.VideoView
import java.io.StringReader
import java.net.URLDecoder
import java.net.URLEncoder
import java.util.*
import javax.xml.parsers.DocumentBuilderFactory

class PlayerFragment : BaseFragment<FragmentPlayerBinding>() {
    override fun providedViewBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentPlayerBinding {
        return FragmentPlayerBinding.inflate(inflater, container, false)
    }

    private var bvid = ""
    private lateinit var detailAdapter: DetailAdapter
    private var detail: Detail.DataBean? = null
    private var mDanmakuView: MyDanmakuView? = null
    private var isPlay = false
    private val danmakuPool = TreeMap<Int, String> { o1, o2 -> o1 - o2 }

    override fun initData() {
        Log.d(TAG, "initData: ${mainModel.bvids}")
        bvid = mainModel.bvids.peekFirst()?.toString() ?: ""
        loadDetail()
        detailAdapter = DetailAdapter(requireActivity())
        mBinding.apply {
            viewPager.offscreenPageLimit = 2
            viewPager.adapter = detailAdapter
            TabLayoutMediator(tabLayout, viewPager, true) { tab, position ->
                tab.text = if (position == 0) "简介" else "评论"
            }.attach()
        }

    }

    override fun initEvent() {

        mainModel.onBackPress = {
            val back = !mBinding.videoView.onBackPressed()
            if (back && mainModel.bvids.size > 0)
                mainModel.bvids.pop()
            back
        }
    }

    private fun initPlayerView() {
        mBinding.apply {
            detail?.let { detail ->
                httpGet("$BASE_URL$PLAY_URL?bvid=${detail.view.bvid}&cid=${detail.view.cid}&qn=112&fnval=0") { succcess, msg ->
                    if (succcess) {
                        Log.d(TAG, "msg: $msg")
                        val bean = Gson().fromJson(msg, PlayUrl::class.java)
                        val url = bean.data.durl[0].url
                        Log.d(TAG, "url: $url")
                        val encode = URLDecoder.decode(url, "UTF-8")
                        Log.d(TAG, "encode: $encode")
                    }
                }
                val url = "$BASE_URL$PLAY_URL?bvid=${detail.view.bvid}&cid=${detail.view.cid}&platform=html5"
                httpGet(url) { success, msg ->
                    if (success) {
                        val bean = Gson().fromJson(msg, PlayUrl::class.java)
                        bean.data?.durl?.get(0)?.url?.let { url ->
                            videoView.setUrl(url) //设置视频地址

                            Handler(Looper.getMainLooper()).post {

                                val controller = StandardVideoController(requireContext())

                                controller.addControlComponent(CompleteView(requireContext()))
                                controller.addControlComponent(ErrorView(requireContext()))
                                val prepareView = PrepareView(requireContext())
                                mDanmakuView = MyDanmakuView(requireContext())
                                controller.addControlComponent(mDanmakuView)
                                controller.addControlComponent(prepareView)
                                prepareView.setClickStart()
                                val titleView = TitleView(requireContext())
                                titleView.setTitle(detail.view.title)
                                controller.addControlComponent(titleView)
                                controller.addControlComponent(MyGestureView(requireContext()))
//                                controller.addControlComponent(MyVideoBottomBar(requireContext()))
                                val myVodControlView = MyVodControlView(requireContext())
                                myVodControlView.setOnProgressChange { i, b ->
                                    Log.d(TAG, "currentTime: ${mDanmakuView?.currentTime}")
                                    if (b) {
                                        Log.d(TAG, "i: $i")
                                        mDanmakuView?.clear()
                                        mDanmakuView?.seekTo(i.toLong())
                                    }
                                }
                                controller.addControlComponent(myVodControlView)
                                controller.setCanChangePosition(true)
                                videoView.setVideoController(controller) //设置控制器
                                videoView.addOnStateChangeListener(object : BaseVideoView.OnStateChangeListener {
                                    override fun onPlayerStateChanged(playerState: Int) {
                                    }

                                    override fun onPlayStateChanged(playState: Int) {
                                        when (playState) {
                                            VideoView.STATE_PREPARED -> {
                                                isPlay = true
                                            }
                                            VideoView.STATE_PAUSED -> {
                                                isPlay = false
                                            }
                                            VideoView.STATE_PLAYBACK_COMPLETED -> {}
                                        }
                                    }

                                })

                                videoView.start() //开始播放，不调用则不自动播放
                            }
                        }
                    } else {
                        Handler(Looper.getMainLooper()).post {
                            Toast.makeText(requireContext(), msg, Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        }
    }

    private fun loadDetail() {
        if (bvid == "") return
        val url = "$BASE_URL$DETAIL?bvid=$bvid"
        httpGet(url) { success, msg ->
            if (success) {
                detail = Gson().fromJson(msg, Detail::class.java)?.data
                mainModel.detail.postValue(detail)
                Handler(Looper.getMainLooper()).post {
                    detail?.let {
                        mBinding.tabLayout.getTabAt(1)?.text = "评论${it.view.stat.reply}"
                    }
                }
                initPlayerView()
                loadDanmaku()
            } else {
                Handler(Looper.getMainLooper()).post {
                    Toast.makeText(requireContext(), msg, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }


    private fun loadDanmaku() {
        detail?.let { detail ->
            val url = "$BASE_URL$DANMAKU${detail.view.cid}"
            Log.d(TAG, "url: $url")
            httpXmlGet(url) { success, xml ->
                if (success) {
                    Log.d(TAG, "xml: $xml")
                    // 获取解析工厂对象
                    val domParserFactory = DocumentBuilderFactory.newInstance()
                    // 获取解析器对象
                    val domParser = domParserFactory.newDocumentBuilder()
                    // 设置解析数据
                    val domSource = domParser.parse(InputSource(StringReader(xml)))
                    // 根据节点名称获得app节点列表
                    val appList = domSource.documentElement.getElementsByTagName("d")
                    for (i in 0 until appList.length) {
                        val item = appList.item(i)
                        val attr = item.attributes.getNamedItem("p").textContent
                        val split = attr.split(",")
                        val time = split[0]
                        val content = item.textContent
                        try {
                            val t = (time.toFloat() * 1000).toInt()
                            danmakuPool[t] = content
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
                    }
//                    startDanmaku()
                    mDanmakuView?.danmakuPool = danmakuPool
                    danmakuPool.forEach { (t, u) ->
                        Log.d(TAG, "startDanmaku: $t==>$u")
                    }
                    mDanmakuView?.startDanmaku(0)
                } else {
                    Handler(Looper.getMainLooper()).post {
                        Toast.makeText(requireContext(), xml, Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        mBinding.videoView.resume()
    }

    override fun onPause() {
        super.onPause()
        mBinding.videoView.pause()
        mDanmakuView?.hideDanmaku()
    }

    override fun onDestroy() {
        super.onDestroy()
        mBinding.videoView.release()
    }

    companion object {
        private const val TAG = "PlayerFragment"
    }
}
