package com.zrq.player.view.video;

import static xyz.doikki.videoplayer.util.PlayerUtils.stringForTime;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.zrq.player.R;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xyz.doikki.videoplayer.controller.ControlWrapper;
import xyz.doikki.videoplayer.controller.IControlComponent;
import xyz.doikki.videoplayer.player.VideoView;
import xyz.doikki.videoplayer.util.PlayerUtils;

/**
 * 点播底部控制栏
 */
public class MyVodControlView extends FrameLayout implements IControlComponent, View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    private static final String TAG = "MyVodControlView";
    protected ControlWrapper mControlWrapper;

    private final TextView mTotalTime;
    private final TextView mCurrTime;
    private final ImageView mHorizontalFullScreen;
    private final ImageView mVerticalFullScreen;
    private final LinearLayout mBottomContainer;
    private final SeekBar mVideoProgress;
    private final ProgressBar mBottomProgress;
    private final ImageView mPlayButton;
    private Activity mActivity = PlayerUtils.scanForActivity(getContext());

    private boolean mIsDragging;

    private boolean mIsShowBottomProgress = true;

    private Function2<Integer, Boolean, Unit> onProgressChange;

    public void setOnProgressChange(Function2<Integer, Boolean, Unit> onProgressChange) {
        this.onProgressChange = onProgressChange;
    }

    public MyVodControlView(@NonNull Context context) {
        super(context);
    }

    public MyVodControlView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyVodControlView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    {
        setVisibility(GONE);
        LayoutInflater.from(getContext()).inflate(getLayoutId(), this, true);
        mHorizontalFullScreen = findViewById(R.id.horizontalFullscreen);
        mHorizontalFullScreen.setOnClickListener(this);
        mVerticalFullScreen = findViewById(R.id.verticalFullscreen);
        mVerticalFullScreen.setOnClickListener(this);
        mBottomContainer = findViewById(R.id.bottom_container);
        mVideoProgress = findViewById(R.id.seekBar);
        mVideoProgress.setOnSeekBarChangeListener(this);
        mTotalTime = findViewById(R.id.total_time);
        mCurrTime = findViewById(R.id.curr_time);
        mPlayButton = findViewById(R.id.iv_play);
        mPlayButton.setOnClickListener(this);
        mBottomProgress = findViewById(R.id.bottom_progress);

        //5.1以下系统SeekBar高度需要设置成WRAP_CONTENT

    }

    protected int getLayoutId() {
        return R.layout.my_video_bottom_bar;
    }

    /**
     * 是否显示底部进度条，默认显示
     */
    public void showBottomProgress(boolean isShow) {
        mIsShowBottomProgress = isShow;
    }

    @Override
    public void attach(@NonNull ControlWrapper controlWrapper) {
        mControlWrapper = controlWrapper;
    }

    @Override
    public View getView() {
        return this;
    }

    @Override
    public void onVisibilityChanged(boolean isVisible, Animation anim) {
        if (isVisible) {
            mBottomContainer.setVisibility(VISIBLE);
            if (anim != null) {
                mBottomContainer.startAnimation(anim);
            }
            if (mIsShowBottomProgress) {
                mBottomProgress.setVisibility(GONE);
            }
        } else {
            mBottomContainer.setVisibility(GONE);
            if (anim != null) {
                mBottomContainer.startAnimation(anim);
            }
            if (mIsShowBottomProgress) {
                mBottomProgress.setVisibility(VISIBLE);
                AlphaAnimation animation = new AlphaAnimation(0f, 1f);
                animation.setDuration(300);
                mBottomProgress.startAnimation(animation);
            }
        }
    }

    @Override
    public void onPlayStateChanged(int playState) {
        switch (playState) {
            case VideoView.STATE_IDLE:
            case VideoView.STATE_PLAYBACK_COMPLETED:
                setVisibility(GONE);
                mBottomProgress.setProgress(0);
                mBottomProgress.setSecondaryProgress(0);
                mVideoProgress.setProgress(0);
                mVideoProgress.setSecondaryProgress(0);
                break;
            case VideoView.STATE_START_ABORT:
            case VideoView.STATE_PREPARING:
            case VideoView.STATE_PREPARED:
            case VideoView.STATE_ERROR:
                setVisibility(GONE);
                break;
            case VideoView.STATE_PLAYING:
                mPlayButton.setSelected(true);
                if (mIsShowBottomProgress) {
                    if (mControlWrapper.isShowing()) {
                        mBottomProgress.setVisibility(GONE);
                        mBottomContainer.setVisibility(VISIBLE);
                    } else {
                        mBottomContainer.setVisibility(GONE);
                        mBottomProgress.setVisibility(VISIBLE);
                    }
                } else {
                    mBottomContainer.setVisibility(GONE);
                }
                setVisibility(VISIBLE);
                //开始刷新进度
                mControlWrapper.startProgress();
                break;
            case VideoView.STATE_PAUSED:
                mPlayButton.setSelected(false);
                break;
            case VideoView.STATE_BUFFERING:
                mPlayButton.setSelected(mControlWrapper.isPlaying());
                // 停止刷新进度
                mControlWrapper.stopProgress();
                break;
            case VideoView.STATE_BUFFERED:
                mPlayButton.setSelected(mControlWrapper.isPlaying());
                //开始刷新进度
                mControlWrapper.startProgress();
                break;
        }
    }

    @Override
    public void onPlayerStateChanged(int playerState) {
        switch (playerState) {
            case VideoView.PLAYER_NORMAL:
                Log.d(TAG, "onPlayerStateChanged: PLAYER_NORMAL");
                mHorizontalFullScreen.setSelected(false);
                mVerticalFullScreen.setSelected(false);
                mVerticalFullScreen.setVisibility(VISIBLE);
                mHorizontalFullScreen.setVisibility(VISIBLE);
                break;
            case VideoView.PLAYER_FULL_SCREEN:
                mHorizontalFullScreen.setSelected(true);
                mVerticalFullScreen.setSelected(true);
                break;
        }

        Activity activity = PlayerUtils.scanForActivity(getContext());
        if (activity != null && mControlWrapper.hasCutout()) {
            int orientation = activity.getRequestedOrientation();
            int cutoutHeight = mControlWrapper.getCutoutHeight();
            if (orientation == ActivityInfo.SCREEN_ORIENTATION_PORTRAIT) {
                mBottomContainer.setPadding(0, 0, 0, 0);
                mBottomProgress.setPadding(0, 0, 0, 0);
            } else if (orientation == ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE) {
                mBottomContainer.setPadding(cutoutHeight, 0, 0, 0);
                mBottomProgress.setPadding(cutoutHeight, 0, 0, 0);
            } else if (orientation == ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE) {
                mBottomContainer.setPadding(0, 0, cutoutHeight, 0);
                mBottomProgress.setPadding(0, 0, cutoutHeight, 0);
            }
        }
    }

    @Override
    public void setProgress(int duration, int position) {
        Log.d(TAG, "setProgress: " + position);
        if (mIsDragging) {
            return;
        }

        if (mVideoProgress != null) {
            if (duration > 0) {
                mVideoProgress.setEnabled(true);
                int pos = (int) (position * 1.0 / duration * mVideoProgress.getMax());
                mVideoProgress.setProgress(pos);
                mBottomProgress.setProgress(pos);
            } else {
                mVideoProgress.setEnabled(false);
            }
            int percent = mControlWrapper.getBufferedPercentage();
            if (percent >= 95) { //解决缓冲进度不能100%问题
                mVideoProgress.setSecondaryProgress(mVideoProgress.getMax());
                mBottomProgress.setSecondaryProgress(mBottomProgress.getMax());
            } else {
                mVideoProgress.setSecondaryProgress(percent * 10);
                mBottomProgress.setSecondaryProgress(percent * 10);
            }
        }

        if (mTotalTime != null)
            mTotalTime.setText(stringForTime(duration));
        if (mCurrTime != null)
            mCurrTime.setText(stringForTime(position));
    }

    @Override
    public void onLockStateChanged(boolean isLocked) {
        onVisibilityChanged(!isLocked, null);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.horizontalFullscreen:
                if (!mHorizontalFullScreen.isSelected()) {
                    mVerticalFullScreen.setVisibility(GONE);
                }
                horizontalFullScreen();
                break;
            case R.id.verticalFullscreen:
                if (!mVerticalFullScreen.isSelected()) {
                    mHorizontalFullScreen.setVisibility(GONE);
                }
                verticalFullScreen();
                break;
            case R.id.iv_play:
                mControlWrapper.togglePlay();
                break;
        }
    }

    /**
     * 横屏全屏切换
     */
    private void horizontalFullScreen() {
        mControlWrapper.toggleFullScreen(mActivity);
        Log.d(TAG, "horizontalFullScreen: " + mControlWrapper.isFullScreen());
    }

    /**
     * 竖屏全屏切换
     */
    private void verticalFullScreen() {
        mControlWrapper.toggleFullScreen();
        Log.d(TAG, "verticalFullScreen: " + mControlWrapper.isFullScreen());
    }


    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        mIsDragging = true;
        mControlWrapper.stopProgress();
        mControlWrapper.stopFadeOut();
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        long duration = mControlWrapper.getDuration();
        long newPosition = (duration * seekBar.getProgress()) / mVideoProgress.getMax();
        mControlWrapper.seekTo((int) newPosition);
        mIsDragging = false;
        mControlWrapper.startProgress();
        mControlWrapper.startFadeOut();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        Log.d(TAG, "progress: " + progress + "fromUser: " + fromUser);
        if (onProgressChange != null)
            onProgressChange.invoke(progress * 100, fromUser);
        if (!fromUser) {
            return;
        }

        long duration = mControlWrapper.getDuration();
        long newPosition = (duration * progress) / mVideoProgress.getMax();
        if (mCurrTime != null)
            mCurrTime.setText(stringForTime((int) newPosition));
    }

}
