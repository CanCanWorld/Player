package com.zrq.player.utils

import android.os.Handler
import android.os.Looper
import android.util.Log
import com.zrq.player.ui.HomeFragment
import okhttp3.*
import java.io.IOException
import java.util.concurrent.TimeUnit

object HttpUtil {

    private const val TAG = "HttpUtil"

    private val okHttpClient by lazy {
        OkHttpClient.Builder()
            .build()
    }

    fun httpGet(url: String, callback: (Boolean, String) -> Unit) {
        Log.d(TAG, "loadPopular: $url")
        val request = Request.Builder()
            .url(url)
            .get()
            .build()
        val call = okHttpClient.newCall(request)
        call.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Handler(Looper.getMainLooper()).post {
                    callback(false, "flag: 2")
                }
            }

            override fun onResponse(call: Call, response: Response) {
                if (response.isSuccessful && response.body != null) {
                    Handler(Looper.getMainLooper()).post {
                        callback(true, response.body!!.string())
                    }
                } else {
                    Handler(Looper.getMainLooper()).post {
                        callback(false, "flag: 1")
                    }
                }
            }
        })
    }
}