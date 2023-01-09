package com.zrq.player.view

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.zrq.player.R
import com.zrq.player.databinding.BottomLoginRegisterBinding
import com.zrq.player.utils.CalculationUtils

class LoginBottomDialog(
    context: Context,
    private val activity: Activity,
) : BottomSheetDialog(context, R.style.BottomSheetDialogBg) {

    private lateinit var mBinding: BottomLoginRegisterBinding

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
                setCanceledOnTouchOutside(false)
            }
        }
        initData()
        initEvent()
    }

    @SuppressLint("SetTextI18n")
    private fun initData() {
        mBinding.apply {
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