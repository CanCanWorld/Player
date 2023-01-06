package com.zrq.player.view.video

import android.content.Context
import android.content.pm.ActivityInfo
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.widget.*
import com.zrq.player.databinding.MyVideoBottomBarBinding
import xyz.doikki.videoplayer.controller.ControlWrapper
import xyz.doikki.videoplayer.controller.IControlComponent
import xyz.doikki.videoplayer.player.VideoView
import xyz.doikki.videoplayer.util.PlayerUtils

class MyVideoBottomBar : FrameLayout, IControlComponent {
    var mControlWrapper: ControlWrapper? = null
    private var mIsDragging = false
    private var mIsShowBottomProgress = true

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}


    private var mBinding: MyVideoBottomBarBinding

    /**
     * 是否显示底部进度条，默认显示
     */
    fun showBottomProgress(isShow: Boolean) {
        mIsShowBottomProgress = isShow
    }

    override fun attach(controlWrapper: ControlWrapper) {
        mControlWrapper = controlWrapper
    }

    override fun getView(): View {
        return this
    }

    override fun onVisibilityChanged(isVisible: Boolean, anim: Animation?) {
        mBinding.apply {
            if (isVisible) {
                bottomContainer.visibility = VISIBLE
                if (anim != null) {
                    bottomContainer.startAnimation(anim)
                }
                if (mIsShowBottomProgress) {
                    bottomProgress.visibility = GONE
                }
            } else {
                bottomContainer.visibility = GONE
                if (anim != null) {
                    bottomContainer.startAnimation(anim)
                }
                if (mIsShowBottomProgress) {
                    bottomProgress.visibility = VISIBLE
                    val animation = AlphaAnimation(0f, 1f)
                    animation.duration = 300
                    bottomProgress.startAnimation(animation)
                }
            }
        }
    }

    override fun onPlayStateChanged(playState: Int) {
        when (playState) {
            VideoView.STATE_IDLE, VideoView.STATE_PLAYBACK_COMPLETED -> {
                visibility = GONE
                mBinding.apply {
                    bottomProgress.progress = 0
                    bottomProgress.secondaryProgress = 0
                    seekBar.progress = 0
                    seekBar.secondaryProgress = 0
                }
            }
            VideoView.STATE_START_ABORT, VideoView.STATE_PREPARING, VideoView.STATE_PREPARED, VideoView.STATE_ERROR -> visibility = GONE
            VideoView.STATE_PLAYING -> {
                mBinding.apply {
                    ivPlay.isSelected = true
                    if (mIsShowBottomProgress) {
                        if (mControlWrapper!!.isShowing) {
                            bottomProgress.visibility = GONE
                            bottomProgress.visibility = VISIBLE
                        } else {
                            bottomContainer.visibility = GONE
                            bottomProgress.visibility = VISIBLE
                        }
                    } else {
                        bottomContainer.visibility = GONE
                    }
                }
                visibility = VISIBLE
                //开始刷新进度
                mControlWrapper!!.startProgress()
            }
            VideoView.STATE_PAUSED -> mBinding.ivPlay.isSelected = false
            VideoView.STATE_BUFFERING -> {
                mBinding.ivPlay.isSelected = mControlWrapper!!.isPlaying
                // 停止刷新进度
                mControlWrapper!!.stopProgress()
            }
            VideoView.STATE_BUFFERED -> {
                mBinding.ivPlay.isSelected = mControlWrapper!!.isPlaying
                //开始刷新进度
                mControlWrapper!!.startProgress()
            }
        }
    }

    override fun onPlayerStateChanged(playerState: Int) {
        when (playerState) {
            VideoView.PLAYER_NORMAL -> mBinding.fullscreen.isSelected = false
            VideoView.PLAYER_FULL_SCREEN -> mBinding.fullscreen.isSelected = true
        }
        val activity = PlayerUtils.scanForActivity(context)
        if (activity != null && mControlWrapper!!.hasCutout()) {
            val orientation = activity.requestedOrientation
            val cutoutHeight = mControlWrapper!!.cutoutHeight
            if (orientation == ActivityInfo.SCREEN_ORIENTATION_PORTRAIT) {
                mBinding.bottomContainer.setPadding(0, 0, 0, 0)
                mBinding.bottomProgress.setPadding(0, 0, 0, 0)
            } else if (orientation == ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE) {
                mBinding.bottomContainer.setPadding(cutoutHeight, 0, 0, 0)
                mBinding.bottomProgress.setPadding(cutoutHeight, 0, 0, 0)
            } else if (orientation == ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE) {
                mBinding.bottomContainer.setPadding(0, 0, cutoutHeight, 0)
                mBinding.bottomProgress.setPadding(0, 0, cutoutHeight, 0)
            }
        }
    }

    override fun setProgress(duration: Int, position: Int) {
        if (mIsDragging) {
            return
        }
        mBinding.apply {

            if (duration > 0) {
                seekBar.isEnabled = true
                val pos = (position * 1.0 / duration * seekBar.getMax()).toInt()
                seekBar.progress = pos
                bottomProgress.progress = pos
            } else {
                seekBar.isEnabled = false
            }
            val percent = mControlWrapper!!.bufferedPercentage
            if (percent >= 95) { //解决缓冲进度不能100%问题
                seekBar.secondaryProgress = seekBar.max
                bottomProgress.secondaryProgress = bottomProgress.max
            } else {
                seekBar.secondaryProgress = percent * 10
                bottomProgress.secondaryProgress = percent * 10
            }
            totalTime.text = PlayerUtils.stringForTime(duration)
            currTime.text = PlayerUtils.stringForTime(position)
        }
    }

    override fun onLockStateChanged(isLocked: Boolean) {
        onVisibilityChanged(!isLocked, null)
    }

    /**
     * 横竖屏切换
     */
    private fun toggleFullScreen() {
        val activity = PlayerUtils.scanForActivity(context)
        mControlWrapper!!.toggleFullScreen(activity)
        // 下面方法会根据适配宽高决定是否旋转屏幕
        mControlWrapper!!.toggleFullScreenByVideoSize(activity)
    }

    init {
        visibility = GONE
        mBinding = MyVideoBottomBarBinding.inflate(LayoutInflater.from(context), this, true)
        mBinding.apply {
            fullscreen.setOnClickListener {
                toggleFullScreen()
            }
            seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                    if (!fromUser) return
                    val duration = mControlWrapper!!.duration
                    val newPosition = duration * progress / mBinding.seekBar.max
                    mBinding.currTime.text = PlayerUtils.stringForTime(newPosition.toInt())
                }

                override fun onStartTrackingTouch(seekBar: SeekBar?) {
                    val duration = mControlWrapper!!.duration
                    val newPosition = duration * (seekBar?.progress ?: 0) / mBinding.seekBar.max
                    mControlWrapper!!.seekTo(newPosition.toInt().toLong())
                    mIsDragging = false
                    mControlWrapper!!.startProgress()
                    mControlWrapper!!.startFadeOut()
                }

                override fun onStopTrackingTouch(seekBar: SeekBar?) {
                    mIsDragging = true
                    mControlWrapper!!.stopProgress()
                    mControlWrapper!!.stopFadeOut()
                }

            })
            ivPlay.setOnClickListener {
                mControlWrapper!!.togglePlay()
            }
        }
    }
}