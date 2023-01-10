package com.zrq.player.view

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.FragmentActivity
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.zrq.player.R
import com.zrq.player.adapter.LoginAdapter
import com.zrq.player.databinding.BottomLoginRegisterBinding
import com.zrq.player.utils.CalculationUtils

class LoginBottomDialog(
    context: Context,
    private val activity: FragmentActivity,
) : BottomSheetDialog(context, R.style.BottomSheetDialogBg) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = BottomLoginRegisterBinding.inflate(LayoutInflater.from(context))
        setContentView(mBinding.root)

        if (window != null) {
            val lp = window?.attributes
            if (lp != null) {
                lp.width = CalculationUtils.getWindowWidth(activity)
                lp.height = CalculationUtils.getWindowHeight(activity)
                window!!.attributes = lp
            }
        }
        val layoutParams = mBinding.root.layoutParams
        layoutParams.width = CalculationUtils.getWindowWidth(activity)
        layoutParams.height = CalculationUtils.getWindowHeight(activity)
        mBinding.root.layoutParams = layoutParams

        setCanceledOnTouchOutside(false)

        initData()
        initEvent()
    }

    private lateinit var mBinding: BottomLoginRegisterBinding
    private lateinit var adapter: LoginAdapter

    @SuppressLint("SetTextI18n")
    private fun initData() {
        adapter = LoginAdapter(activity) {
            mBinding.viewPager2.currentItem = it
        }
        mBinding.apply {
            viewPager2.adapter = adapter
        }
    }

    private fun initEvent() {
        mBinding.apply {
            ivClose.setOnClickListener {
                dismiss()
            }
        }
    }
}