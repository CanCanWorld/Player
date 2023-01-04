package com.zrq.player.view

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.zrq.player.R
import com.zrq.player.bean.RelateDao
import com.zrq.player.databinding.BottomRelatedVideoSettingBinding
import com.zrq.player.utils.CalculationUtils

class RelatedHideBottomDialog(
    context: Context,
    private val activity: Activity,
    val bean: RelateDao,
    val onItemClick: () -> Unit
) : BottomSheetDialog(context) {

    private lateinit var mBinding: BottomRelatedVideoSettingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = BottomRelatedVideoSettingBinding.inflate(LayoutInflater.from(context))
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
            tvUpName.text = "UP主：" + bean.owner.name
        }
    }

    private fun initEvent() {
        mBinding.apply {

            tvBloody.setOnClickListener {
                bean.banType = context.resources.getString(R.string.horrible_bloody)
                bean.isDismiss = true
                onItemClick()
                dismiss()
            }
            tvPorn.setOnClickListener {
                bean.banType = context.resources.getString(R.string.porn)
                bean.isDismiss = true
                onItemClick()
                dismiss()
            }
            tvNausea.setOnClickListener {
                bean.banType = context.resources.getString(R.string.nausea)
                bean.isDismiss = true
                onItemClick()
                dismiss()
            }
            tvCover.setOnClickListener {
                bean.banType = context.resources.getString(R.string.cover_party)
                bean.isDismiss = true
                onItemClick()
                dismiss()
            }
            tvUpName.setOnClickListener {
                bean.banType = "UP主：" + bean.owner.name
                bean.isDismiss = true
                onItemClick()
                dismiss()
            }
            tvDislike.setOnClickListener {
                bean.banType = context.resources.getString(R.string.dislike)
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