package com.zrq.player.view

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.zrq.player.R
import com.zrq.player.bean.RegionVideo
import com.zrq.player.databinding.BottomVideoSettingBinding
import com.zrq.player.utils.CalculationUtils

class HideBottomDialog(
    context: Context,
    private val activity: Activity,
    val bean: RegionVideo.DataBean.ArchivesBean,
    val onItemClick: () -> Unit
) : BottomSheetDialog(context) {

    private lateinit var mBinding: BottomVideoSettingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = BottomVideoSettingBinding.inflate(LayoutInflater.from(context))
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
            tvPartition.text = "分区：" + bean.tname
            tvChannel.text = "频道："
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
            tvPartition.setOnClickListener {
                bean.banType = "分区：" + bean.tname
                bean.isDismiss = true
                onItemClick()
                dismiss()
            }
            tvChannel.setOnClickListener {
                bean.banType = "频道："
                bean.isDismiss = true
                onItemClick()
                dismiss()
            }
            tvSoMach.setOnClickListener {
                bean.banType = context.resources.getString(R.string.so_much)
                bean.isDismiss = true
                onItemClick()
                dismiss()
            }
            tvRecommended.setOnClickListener {
                bean.banType = context.resources.getString(R.string.recommended)
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