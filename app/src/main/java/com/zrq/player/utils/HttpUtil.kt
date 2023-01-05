package com.zrq.player.utils

import android.util.Log
import com.zrq.player.utils.Constants.BILIBILI
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.util.concurrent.TimeUnit

object HttpUtil {

    private const val TAG = "HttpUtil"

    private val okHttpClient by lazy {
        OkHttpClient.Builder()
            .readTimeout(20000L, TimeUnit.MILLISECONDS)
            .connectTimeout(20000L, TimeUnit.MILLISECONDS)
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
            .addHeader("Accept", "*/*")
            .addHeader("Cache-Control", "no-cache")
            .addHeader("Content-type", "application/xml;charset=utf-8")
            .addHeader("Accept-Encoding", "deflate")
            .addHeader("Connection", "keep-alive")
            .addHeader("Transfer-Encoding", "chunked")
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

    fun httpXmlGet(url: String, callback: (Boolean, String) -> Unit) {
        Thread {
            val connection: HttpURLConnection = URL(url).openConnection() as HttpURLConnection
            connection.setRequestProperty("Content-Type", "application/xml;charset=utf-8")
            connection.connectTimeout = 20000
            connection.readTimeout = 20000
            connection.doInput = true
            connection.useCaches = false
            connection.requestMethod = "GET"
            connection.setRequestProperty("Content-Encoding", "deflate")
            connection.setRequestProperty("Accept-Encoding", "gzip, deflate, br")
            connection.instanceFollowRedirects = false
            connection.connect()
            val inputStream = connection.inputStream
            Log.d(TAG, "responseCode: ${connection.responseCode}")

            val reader = BufferedReader(InputStreamReader(inputStream, "UTF-8"))
            val buffer = StringBuffer()
            var line: String? = ""
            while (reader.readLine().also { line = it } != null) {
                buffer.append(line)
            }
            Log.d(TAG, "httpXmlGet: $buffer")
            callback(true, buffer.toString())
        }.start()
    }

    fun getCookie(callback: (Boolean, String) -> Unit) {
        httpGet(BILIBILI, callback)
    }

}