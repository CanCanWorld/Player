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
import com.zrq.player.bean.Video
import com.zrq.player.databinding.FragmentPlayerBinding
import com.zrq.player.utils.Constants.BASE_URL
import com.zrq.player.utils.Constants.DANMAKU
import com.zrq.player.utils.Constants.DETAIL
import com.zrq.player.utils.Constants.PLAY_URL
import com.zrq.player.utils.HttpUtil.httpGet
import com.zrq.player.utils.HttpUtil.httpGet2
import com.zrq.player.utils.HttpUtil.httpXmlGet
import org.xml.sax.InputSource
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserException
import org.xmlpull.v1.XmlPullParserFactory
import tv.danmaku.ijk.media.player.IjkMediaPlayer
import xyz.doikki.videocontroller.StandardVideoController
import xyz.doikki.videoplayer.ijk.IjkPlayerFactory
import java.io.StringReader

class PlayerFragment : BaseFragment<FragmentPlayerBinding>() {
    override fun providedViewBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentPlayerBinding {
        return FragmentPlayerBinding.inflate(inflater, container, false)
    }

    private var video: Video? = null
    private lateinit var detailAdapter: DetailAdapter
    private var detail: Detail.DataBean? = null

    override fun initData() {
        video = mainModel.videos.peekFirst()
        loadDetail()
        loadDanmaku()
        detailAdapter = DetailAdapter(requireActivity())
        mBinding.apply {
            video?.let { video ->
                viewPager.offscreenPageLimit = 2
                viewPager.adapter = detailAdapter
                TabLayoutMediator(tabLayout, viewPager, true) { tab, position ->
                    tab.text = if (position == 0) "简介" else "评论${video.reply}"
                }.attach()
            }
        }
        initPlayerView()
    }

    override fun initEvent() {

        mainModel.onBackPress = {
            if (mBinding.videoView.onBackPressed()) {
            } else {
                mainModel.videos.pop()
            }
        }
    }

    private fun initPlayerView() {
        mBinding.apply {
            video?.let { video ->
                val url = "$BASE_URL$PLAY_URL?bvid=${video.bvid}&cid=${video.cid}&platform=html5"
                httpGet(url) { success, msg ->
                    if (success) {
                        val bean = Gson().fromJson(msg, PlayUrl::class.java)
                        bean.data?.durl?.get(0)?.url?.let { url ->
                            videoView.setUrl(url) //设置视频地址

                            Handler(Looper.getMainLooper()).post {
                                val controller = StandardVideoController(requireContext())
                                controller.addDefaultControlComponent(video.title, false)
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
        video?.let { video ->
            val url = "$BASE_URL$DETAIL?bvid=${video.bvid}"
            httpGet(url) { success, msg ->
                if (success) {
                    detail = Gson().fromJson(msg, Detail::class.java)?.data
                    mainModel.detail.postValue(detail)
                } else {
                    Handler(Looper.getMainLooper()).post {
                        Toast.makeText(requireContext(), msg, Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }

    private fun loadDanmaku() {
        video?.let { video ->
            val url = "https://comment.bilibili.com/${video.cid}.xml"
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
