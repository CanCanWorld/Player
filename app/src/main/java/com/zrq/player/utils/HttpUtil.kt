package com.zrq.player.utils

import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.tencent.mmkv.MMKV
import com.zrq.player.utils.Constants.BILIBILI
import okhttp3.*
import java.io.*
import java.net.HttpURLConnection
import java.net.URL
import java.util.concurrent.TimeUnit
import java.util.zip.Inflater
import java.util.zip.InflaterInputStream
import java.util.zip.InflaterOutputStream


object HttpUtil {

    private const val TAG = "HttpUtil"

    private val mCookies = mutableListOf<Cookie>()
    private val mmkv = MMKV.defaultMMKV()

    data class Cookies(
        var cookies: List<Cookie>
    )

    private val okHttpClient by lazy {
        OkHttpClient.Builder()
            .cookieJar(object : CookieJar {
                override fun loadForRequest(url: HttpUrl): List<Cookie> {
                    val cookies = mmkv.getString("cookies", "")
                    val list = mutableListOf<Cookie>()
                    val fromJson = Gson().fromJson(cookies, Cookies::class.java)
                    fromJson?.cookies?.let {
                        return fromJson.cookies
                    }
                    return mutableListOf()
                }

                override fun saveFromResponse(url: HttpUrl, cookies: List<Cookie>) {
                    val jsonStr = Gson().toJson(Cookies(cookies), object : TypeToken<Cookies>() {}.type)
                    mmkv.putString("cookies", jsonStr)

                    mCookies.clear()
                    mCookies.addAll(cookies)
                }
            })
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

    fun httpPost(url: String, callback: (Boolean, String) -> Unit) {
        Log.d(TAG, "load: $url")
        val formBody: FormBody = FormBody.Builder().build()
        val request = Request.Builder()
            .url(url)
            .post(formBody)
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
            connection.instanceFollowRedirects = false
            connection.connect()

            var inputStream = connection.inputStream
            inputStream = BufferedInputStream(inputStream)
            inputStream = InflaterInputStream(inputStream, Inflater(true))

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