package com.zrq.player.ui

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.ImageButton
import android.widget.Toast
import androidx.navigation.Navigation
import com.google.android.exoplayer2.DefaultLoadControl
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.gson.Gson
import com.zrq.player.R
import com.zrq.player.adapter.RelatedAdapter
import com.zrq.player.bean.PlayUrl
import com.zrq.player.bean.Related
import com.zrq.player.bean.Video
import com.zrq.player.databinding.FragmentPlayerBinding
import com.zrq.player.utils.Constants.BASE_URL
import com.zrq.player.utils.Constants.PLAY_URL
import com.zrq.player.utils.Constants.RELATED
import com.zrq.player.utils.HttpUtil.httpGet

class PlayerFragment : BaseFragment<FragmentPlayerBinding>() {
    override fun providedViewBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentPlayerBinding {
        return FragmentPlayerBinding.inflate(inflater, container, false)
    }

    private var video: Video? = null
    private val list = mutableListOf<Related.DataDTO>()
    private val exoPlayer by lazy {
        ExoPlayer.Builder(requireContext())
            .setLoadControl(DefaultLoadControl())
            .build()
    }
    private lateinit var adapter: RelatedAdapter

    override fun initData() {
        adapter = RelatedAdapter(requireContext(), list) { _, position ->
            val bean = list[position]
            Log.d(TAG, "initData: ${bean.title}")
            mainModel.videos.push(Video(bean.title, bean.bvid, bean.cid))
            Navigation.findNavController(requireActivity(), R.id.fragment_container)
                .navigate(R.id.playerFragment)
        }
        mBinding.apply {
            recyclerView.adapter = adapter
        }
        video = mainModel.videos.peekFirst()

        initPlayerView()
        initRecommend()
        val layoutParams = mBinding.playerView.layoutParams
        if (mainModel.isFullScreen) {
            layoutParams.height = WindowManager.LayoutParams.MATCH_PARENT
        } else {
            layoutParams.height = 600
        }
        mBinding.playerView.layoutParams = layoutParams
    }


    override fun initEvent() {
        mBinding.playerView.findViewById<ImageButton>(R.id.exo_fullscreen_button).setOnClickListener {
            if (mainModel.isFullScreen) {
                mainModel.isFullScreen = false
                requireActivity().requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED
            } else {
                requireActivity().requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
                mainModel.isFullScreen = true
            }
        }
        mainModel.onBackListener = {
            Log.d(TAG, "back..")
            if (mainModel.isFullScreen) {
                requireActivity().requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED
                mainModel.isFullScreen = false
            }else{
                mainModel.videos.pop()
            }
        }
    }

    private fun initPlayerView() {
        video?.let { video ->
            mBinding.playerView.player = exoPlayer
            val url = "$BASE_URL$PLAY_URL?bvid=${video.bvid}&cid=${video.cid}&platform=html5"
            httpGet(url) { success, msg ->
                if (success) {
                    val bean = Gson().fromJson(msg, PlayUrl::class.java)
                    bean.data?.durl?.get(0)?.url?.let {
                        val mediaItem = MediaItem.fromUri(it)
                        exoPlayer.setMediaItem(mediaItem)
                        exoPlayer.prepare()
                    }
                } else {
                    Toast.makeText(requireContext(), msg, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun initRecommend() {
        video?.let { video ->
            val url = "$BASE_URL$RELATED?bvid=${video.bvid}"
            httpGet(url) { success, msg ->
                if (success) {
                    val bean = Gson().fromJson(msg, Related::class.java)
                    list.clear()
                    list.addAll(bean.data)
                    adapter.notifyDataSetChanged()
                } else {
                    Toast.makeText(requireContext(), msg, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    override fun onPause() {
        super.onPause()
        exoPlayer.pause()
    }

    override fun onDestroy() {
        super.onDestroy()
        exoPlayer.release()
    }

    companion object {
        private const val TAG = "PlayerFragment"
    }
}
