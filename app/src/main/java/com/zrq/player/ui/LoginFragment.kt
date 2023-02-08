package com.zrq.player.ui

import android.os.Build
import android.text.Editable
import android.text.TextWatcher
import android.util.Base64
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import com.geetest.sdk.GT3ConfigBean
import com.geetest.sdk.GT3ErrorBean
import com.geetest.sdk.GT3GeetestUtils
import com.geetest.sdk.GT3Listener
import com.zrq.player.databinding.FragmentLoginBinding
import com.zrq.player.utils.Constants
import com.zrq.player.utils.Constants.PAGE_REGISTER
import com.zrq.player.utils.HttpUtil.httpGet
import com.zrq.player.utils.HttpUtil.httpPost
import org.json.JSONObject
import java.security.KeyFactory
import java.security.spec.X509EncodedKeySpec
import javax.crypto.Cipher


class LoginFragment(
    private val onPageChangeListener: (Int) -> Unit
) : BaseFragment<FragmentLoginBinding>() {
    override fun providedViewBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentLoginBinding {
        return FragmentLoginBinding.inflate(inflater, container, false)
    }

    private var gt3GeetestUtils: GT3GeetestUtils? = null
    private var gt3ConfigBean: GT3ConfigBean? = null
    private var token = ""
    private var username = ""
    private var password = ""

    override fun initData() {
        initGeetest()
        mBinding.apply { }
    }

    private fun initGeetest() {
        // 请在onCreate方法里初始化以获取足够手势数据来保证第一轮验证成功率
        gt3GeetestUtils = GT3GeetestUtils(requireContext())
        // 配置bean文件，也可在onCreate初始化
        gt3ConfigBean = GT3ConfigBean().apply {
            // 设置验证模式，1：bind，2：unbind
            pattern = 1
            // 设置点击灰色区域是否消失，默认不消失
            isCanceledOnTouchOutside = false
            // 设置语言，如果为null则使用系统默认语言
            lang = null
            // 设置加载webView超时时间，单位毫秒，默认10000，仅且webView加载静态文件超时，不包括之前的http请求
            timeout = 10000
            // 设置webView请求超时(用户点选或滑动完成，前端请求后端接口)，单位毫秒，默认10000
            webviewTimeout = 10000

            // 设置回调监听
            listener = object : GT3Listener() {
                /**
                 * 自定义api2回调
                 * @param result，api2请求上传参数
                 */
                @RequiresApi(Build.VERSION_CODES.O)
                override fun onDialogResult(result: String?) {
                    super.onDialogResult(result)
                    Log.d(TAG, "onDialogResult: $result")
                    result?.let {
                        try {
                            val challenge = JSONObject(result).getString("geetest_challenge")
                            val seccode = JSONObject(result).getString("geetest_seccode")
                            val validate = JSONObject(result).getString("geetest_validate")
                            if (seccode != "" && validate != "") {
                                gt3GeetestUtils?.showSuccessDialog()
                                //获取公钥和盐
                                val url = "${Constants.SEND_MSG}?cid=86&tel=$username&source=main_web&token=$token&challenge=$challenge&validate=$validate&seccode=$seccode"
                                httpPost(url) { success, msg ->
                                    if (success) {
                                        Log.d(TAG, "sendMsg: $msg")
                                    } else {

                                    }

                                }
//                                httpGet(Constants.GET_KEY) { success, msg ->
//                                    if (success) {
//                                        val data = JSONObject(msg).getJSONObject("data")
//                                        val hash = data.getString("hash")
//                                        val key = data.getString("key")
//                                        val split = key.trim().split("\n")
//                                        val newKey = split[1] + split[2] + split[3] + split[4]
//                                        Log.d(TAG, "hash: $hash")
//                                        Log.d(TAG, "newKey: $newKey")
//                                        val keyFactory = KeyFactory.getInstance("RSA")
//                                        val keySpec = X509EncodedKeySpec(Base64.decode(newKey, Base64.DEFAULT))
//                                        val publicKey = keyFactory.generatePublic(keySpec)
//                                        val cipher = Cipher.getInstance(keyFactory.algorithm)
//                                        cipher.init(Cipher.ENCRYPT_MODE, publicKey)
//                                        val bytes = cipher.doFinal((hash + password).toByteArray())
//                                        val encode = Base64.encode(bytes, Base64.DEFAULT)
//                                        Log.d(TAG, "encode: $encode")
//                                        //请求登录接口
//                                        val url = Constants.LOGIN + "?username=$username&password=$encode&keep=0&token=$token&challenge=$challenge&validate=$validate&seccode=$seccode"
//                                        Log.d(TAG, "onDialogResult: $url")
//                                        httpPost(url) { success, msg ->
//                                            if (success) {
//                                                Log.d(TAG, "msg: $msg")
//                                            }
//                                        }
//                                    }
//                                }
                            } else {
                                gt3GeetestUtils?.showFailedDialog()
                            }
                        } catch (e: Exception) {
                            gt3GeetestUtils?.showFailedDialog()
                            e.printStackTrace()
                        }
                    }
                }

                /**
                 * 图形验证结果回调
                 * @param code 1为正常 0为失败
                 */
                override fun onReceiveCaptchaCode(code: Int) {
                    Log.d(TAG, "onReceiveCaptchaCode: $code")
                }

                /**
                 * 统计信息，参考接入文档
                 * @param result
                 */
                override fun onStatistics(result: String?) {
                    Log.d(TAG, "onStatistics: $result")
                }

                /**
                 * 验证码被关闭
                 * @param num 1 点击验证码的关闭按钮来关闭验证码, 2 点击屏幕关闭验证码, 3 点击返回键关闭验证码
                 */
                override fun onClosed(num: Int) {
                    Log.d(TAG, "onClosed: $num")
                }

                /**
                 * 验证成功回调
                 * @param result
                 */
                override fun onSuccess(result: String?) {
                    Log.d(TAG, "onSuccess: $result")

                }

                /**
                 * 验证失败回调
                 * @param errorBean 版本号，错误码，错误描述等信息
                 */
                override fun onFailed(errorBean: GT3ErrorBean?) {
                    Log.d(TAG, "onFailed: $errorBean")
                }

                /**
                 * 自定义api1回调
                 */
                override fun onButtonClick() {
                    Log.d(TAG, "onButtonClick: ")
                }
            }
        }

        gt3GeetestUtils!!.init(gt3ConfigBean)

    }

    override fun initEvent() {
        mBinding.apply {
            llToRegister.setOnClickListener {
                onPageChangeListener(PAGE_REGISTER)
            }
            etUsername.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    if (s != "") {
                        textInputUsername.isErrorEnabled = false
                    }
                }

                override fun afterTextChanged(s: Editable?) {
                }
            })
            etPassword.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    if (s != "") {
                        textInputPassword.isErrorEnabled = false
                    }
                }

                override fun afterTextChanged(s: Editable?) {
                }
            })
            btnSendMsg.setOnClickListener {
                if (etUsername.text.toString() == "") {
                    textInputUsername.error = "密码不能为空"
                    return@setOnClickListener
                }
                username = etUsername.text.toString()
                //获取后台验证码信息
                httpGet(Constants.REQUEST_CAPTCHA) { success, msg ->
                    if (success) {
                        Log.d(TAG, "initEvent: $msg")
                        try {
                            val geetest = JSONObject(msg).getJSONObject("data").getJSONObject("geetest")
                            token = JSONObject(msg).getJSONObject("data").getString("token")
                            geetest.apply {
                                put("success", "1")
                                put("new_captcha", true)
                                gt3ConfigBean?.api1Json = geetest
                                //开始验证
                                gt3GeetestUtils!!.getGeetest()
                            }
                        } catch (e: Exception) {
                            e.printStackTrace()
                            gt3GeetestUtils?.showSuccessDialog()
                        }
                    }
                }
                gt3GeetestUtils!!.startCustomFlow()
            }
            btnLogin.setOnClickListener {
                if (etUsername.text.toString() == "") {
                    textInputUsername.error = "密码不能为空"
                    return@setOnClickListener
                }
                if (etPassword.text.toString() == "") {
                    textInputPassword.error = "密码不能为空"
                    return@setOnClickListener
                }
                //登录逻辑
                username = etUsername.text.toString()
                password = etPassword.text.toString()
                //获取后台验证码信息
                httpGet(Constants.REQUEST_CAPTCHA) { success, msg ->
                    if (success) {
                        Log.d(TAG, "initEvent: $msg")
                        try {
                            val geetest = JSONObject(msg).getJSONObject("data").getJSONObject("geetest")
                            token = JSONObject(msg).getJSONObject("data").getString("token")
                            geetest.apply {
                                put("success", "1")
                                put("new_captcha", true)
                                gt3ConfigBean?.api1Json = geetest
                                //开始验证
                                gt3GeetestUtils!!.getGeetest()
                            }
                        } catch (e: Exception) {
                            e.printStackTrace()
                            gt3GeetestUtils?.showSuccessDialog()
                        }
                    }
                }
                //显示获取验证信息
                gt3GeetestUtils!!.startCustomFlow()

            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        gt3GeetestUtils?.dismissGeetestDialog()
        gt3GeetestUtils?.destory()
    }

    companion object {
        private const val TAG = "LoginFragment"
    }

}
