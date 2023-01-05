package com.zrq.player.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.request.RequestOptions
import com.zrq.player.R
import com.zrq.player.bean.RelateDao
import com.zrq.player.bean.Search
import com.zrq.player.bean.SearchVideo
import com.zrq.player.databinding.ItemRelatedBinding
import com.zrq.player.utils.CalculationUtils
import jp.wasabeef.glide.transformations.BlurTransformation

class SearchAdapter(
    private val context: Context,
    private val list: MutableList<Search.DataDTO.ResultDTO>,
    private val onItemClickListener: (View, Int) -> Unit,
    private val onItemLongClickListener: (View, Int) -> Unit,
) : RecyclerView.Adapter<VH<ItemRelatedBinding>>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH<ItemRelatedBinding> {
        return VH(ItemRelatedBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onBindViewHolder(holder: VH<ItemRelatedBinding>, position: Int) {
        val beans = mutableListOf<SearchVideo>()
        list.forEach {
            if (it.result_type == "video") {
                beans.clear()
                beans.addAll(it.data)
            }
        }
        val bean = beans[position]
        holder.binding.apply {
//            if (bean.isDismiss) {
//                Glide.with(context)
//                    .load(bean.pic)
//                    .apply(RequestOptions.bitmapTransform(MultiTransformation(BlurTransformation(90))))
//                    .into(ivBlur)
//                tvBanType.text = bean.banType
//                llDislike.visibility = View.VISIBLE
//                llRoot.visibility = View.GONE
//                llRoot.startAnimation(AnimationUtils.loadAnimation(context, R.anim.anim_fade_out))
//            } else {
            Glide.with(context)
                .load(bean)
                .into(ivCover)
            llDislike.visibility = View.GONE
            llRoot.visibility = View.VISIBLE
            llRoot.startAnimation(AnimationUtils.loadAnimation(context, R.anim.anim_fade_in))
//            }
            tvTitle.text = bean.title
            llRoot.setOnClickListener {
                onItemClickListener(it, position)
            }
            llRoot.setOnLongClickListener {
                onItemLongClickListener(it, position)
                true
            }
            llReset.setOnClickListener {
//                bean.isDismiss = false
                notifyItemChanged(position)
            }
            ivSetting.setOnClickListener {
                onItemLongClickListener(it, position)
            }
//            tvUpName.text = bean.owner.name
//            tvPlayNum.text = CalculationUtils.formatNum(bean.stat.view)
//            tvDanMu.text = CalculationUtils.formatNum(bean.stat.danmaku)
//            tvDuration.text = CalculationUtils.formatDuration(bean.duration)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}