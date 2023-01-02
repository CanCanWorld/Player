package com.zrq.player

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import androidx.lifecycle.ViewModelProvider
import com.zrq.player.databinding.ActivityMainBinding
import com.zrq.player.utils.StatusBarUtil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        StatusBarUtil.transparencyBar(this)
        mainModel = ViewModelProvider(this)[MainModel::class.java]
    }

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mainModel: MainModel


    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            mainModel.onBackPress()
        }
        return super.onKeyDown(keyCode, event)
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}