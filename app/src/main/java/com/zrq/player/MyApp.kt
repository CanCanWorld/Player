package com.zrq.player

import android.app.Application
import com.google.android.material.color.DynamicColors

/**
 * @Description:
 * @author zhangruiqian
 * @date 2023/8/7 15:11
 */
class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()

        DynamicColors.applyToActivitiesIfAvailable(this)
    }

}