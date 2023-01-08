package com.zrq.player

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import androidx.lifecycle.ViewModelProvider
import com.tencent.mmkv.MMKV
import com.zrq.player.databinding.ActivityMainBinding
import com.zrq.player.utils.StatusBarUtil
import tv.danmaku.ijk.media.player.IjkMediaPlayer
import xyz.doikki.videoplayer.exo.ExoMediaPlayerFactory
import xyz.doikki.videoplayer.ijk.IjkPlayerFactory
import xyz.doikki.videoplayer.player.VideoViewConfig
import xyz.doikki.videoplayer.player.VideoViewManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        MMKV.initialize(this)
        StatusBarUtil.transparencyBar(this)
        mainModel = ViewModelProvider(this)[MainModel::class.java]
        initData()
    }

    private lateinit var mBinding: ActivityMainBinding

    private lateinit var mainModel: MainModel
    private fun initData() {
        VideoViewManager.setConfig(
            VideoViewConfig.newBuilder()
                .setPlayerFactory(ExoMediaPlayerFactory.create())
                .build()
        );
    }

    override fun onBackPressed() {
        if (mainModel.onBackPress())
            super.onBackPressed()
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}