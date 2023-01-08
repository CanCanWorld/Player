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
import com.zrq.player.utils.Constants.DETAIL
import com.zrq.player.utils.Constants.PLAY_URL
import com.zrq.player.utils.HttpUtil.httpGet
import com.zrq.player.utils.HttpUtil.httpXmlGet
import com.zrq.player.view.video.MyGestureView
import com.zrq.player.view.video.MyVodControlView
import xyz.doikki.videocontroller.StandardVideoController
import xyz.doikki.videocontroller.component.*

class PlayerFragment : BaseFragment<FragmentPlayerBinding>() {
    override fun providedViewBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentPlayerBinding {
        return FragmentPlayerBinding.inflate(inflater, container, false)
    }

    private var bvid = ""
    private lateinit var detailAdapter: DetailAdapter
    private var detail: Detail.DataBean? = null

    override fun initData() {
        Log.d(TAG, "initData: ${mainModel.bvids}")
        bvid = mainModel.bvids.peekFirst().toString()
        loadDetail()
//        loadDanmaku()
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
                val url = "$BASE_URL$PLAY_URL?bvid=${detail.view.bvid}&cid=${detail.view.cid}&platform=html5"
                httpGet(url) { success, msg ->
                    if (success) {
                        val bean = Gson().fromJson(msg, PlayUrl::class.java)
                        bean.data?.durl?.get(0)?.url?.let { url ->
                            videoView.setUrl(url) //设置视频地址

                            Handler(Looper.getMainLooper()).post {

                                var controller = StandardVideoController(requireContext())

                                controller.addControlComponent(CompleteView(requireContext()))
                                controller.addControlComponent(ErrorView(requireContext()))
                                val prepareView = PrepareView(requireContext())
                                controller.addControlComponent(prepareView)
                                prepareView.setClickStart()
                                val titleView = TitleView(requireContext())
                                titleView.setTitle(detail.view.title)
                                controller.addControlComponent(titleView)
                                controller.addControlComponent(MyGestureView(requireContext()))
//                                controller.addControlComponent(MyVideoBottomBar(requireContext()))

                                controller.addControlComponent(MyVodControlView(requireContext()))
                                controller.setCanChangePosition(true)
                                videoView.setVideoController(controller) //设置控制器

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
            } else {
                Handler(Looper.getMainLooper()).post {
                    Toast.makeText(requireContext(), msg, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun loadDanmaku() {
        detail?.let { detail ->
            val url = "https://comment.bilibili.com/${detail.view.cid}.xml"
            Log.d(TAG, "url: $url")
            httpXmlGet(url) { success, msg ->
                if (success) {
                    Log.d(TAG, "msg: $msg")
//                    try {
//                        val factory = XmlPullParserFactory.newInstance()
//                        val xmlPullParser = factory.newPullParser()
//                        xmlPullParser.setInput(StringReader(msg))
//                        var type = xmlPullParser.eventType
//                        while (type != XmlPullParser.END_DOCUMENT) {
//                            val node = xmlPullParser.name
//                            when (type) {
//                                XmlPullParser.START_TAG -> {
//                                    if ("state" == node) {
//                                        Log.d(TAG, "loadDanmaku: ${xmlPullParser.nextText()}")
//                                    }
//                                }
//                                else -> {}
//                            }
//                            type = xmlPullParser.next()
//                        }
//                    } catch (e: XmlPullParserException) {
//                        e.printStackTrace()
//                    }
                } else {
                    Handler(Looper.getMainLooper()).post {
                        Toast.makeText(requireContext(), msg, Toast.LENGTH_SHORT).show()
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
    }

    override fun onDestroy() {
        super.onDestroy()
        mBinding.videoView.release()
    }

    companion object {
        private const val TAG = "PlayerFragment"
    }
}
