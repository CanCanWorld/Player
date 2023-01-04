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
        Log.d(TAG, "load: $url")
        val request = Request.Builder()
            .url(url)
            .get()
            .build()
        val call = okHttpClient.newCall(request)
        call.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                callback(false, "flag: 2")
            }

            override fun onResponse(call: Call, response: Response) {
                if (response.isSuccessful && response.body != null) {
                    callback(true, response.body!!.string())
                } else {
                    callback(false, "flag: 1")
                }
            }
        })
    }

    fun httpGet2(url: String, callback: (Boolean, String) -> Unit) {
        Log.d(TAG, "load: $url")
        val request = Request.Builder()
            .url(url)
            .get()
            .addHeader("User-Agent", "PostmanRuntime/7.15.2")
            .addHeader("Accept", "*/*")
            .addHeader("Cache-Control", "no-cache")
            .addHeader("Content-type", "application/xml;charset=utf-8")
            .addHeader("Cookie", "LIVE_BUVID=AUTO6316723059308065")
            .addHeader("Accept-Encoding", "deflate")
            .addHeader("Connection", "keep-alive")
            .build()
//        request.headers.forEach {
//            Log.d("TAG", "onResponse: $it")
//        }
        val call = okHttpClient.newCall(request)
        call.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                callback(false, "flag: 2")
            }

            override fun onResponse(call: Call, response: Response) {
                if (response.isSuccessful && response.body != null) {
                    callback(true, response.body!!.string())
                } else {
                    callback(false, "flag: 1")
                }
            }
        })
    }
}