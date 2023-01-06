package com.zrq.player.view

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.zrq.player.R
import com.zrq.player.bean.Search
import com.zrq.player.databinding.BottomSearchVideoSettingBinding
import com.zrq.player.utils.CalculationUtils

class SearchBottomDialog(
    context: Context,
    private val activity: Activity,
    val bean: Search.DataBean.ResultBean,
    val onItemClick: () -> Unit
) : BottomSheetDialog(context) {

    private lateinit var mBinding: BottomSearchVideoSettingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = BottomSearchVideoSettingBinding.inflate(LayoutInflater.from(context))
        initData()
        initEvent()
        setContentView(mBinding.root)


        if (window != null) {
            val lp = window?.attributes
            if (lp != null) {
                lp.width = CalculationUtils.getWindowWidth(activity)
                window!!.attributes = lp
                setCanceledOnTouchOutside(true)
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun initData() {
        mBinding.apply {
        }
    }

    private fun initEvent() {
        mBinding.apply {

            tvIrrelevant.setOnClickListener {
                bean.banType = context.resources.getString(R.string.irrelevant)
                bean.isDismiss = true
                onItemClick()
                dismiss()
            }
            tvPoorQuality.setOnClickListener {
                bean.banType = context.resources.getString(R.string.poor_quality)
                bean.isDismiss = true
                onItemClick()
                dismiss()
            }
            tvOutdatedContent.setOnClickListener {
                bean.banType = context.resources.getString(R.string.outdated_content)
                bean.isDismiss = true
                onItemClick()
                dismiss()
            }
            tvDontWatch.setOnClickListener {
                bean.banType = context.resources.getString(R.string.dont_watch)
                bean.isDismiss = true
                onItemClick()
                dismiss()
            }
            tvCancel.setOnClickListener {
                dismiss()
            }
        }
    }
}