package com.zrq.player.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.request.RequestOptions
import com.zrq.player.R
import com.zrq.player.bean.RegionVideo
import com.zrq.player.databinding.ItemVideoBinding
import com.zrq.player.utils.CalculationUtils
import jp.wasabeef.glide.transformations.BlurTransformation

class HomeVideoAdapter(
    private val context: Context,
    private val list: MutableList<RegionVideo.DataBean.ArchivesBean>,
    private val onItemClickListener: (View, Int) -> Unit,
    private val onItemLongClickListener: (View, Int) -> Unit,
) : RecyclerView.Adapter<VH<ItemVideoBinding>>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH<ItemVideoBinding> {
        return VH(ItemVideoBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onBindViewHolder(holder: VH<ItemVideoBinding>, position: Int) {
        val bean = list[position]
        holder.binding.apply {
            if (bean.isDismiss) {
                Glide.with(context)
                    .load(bean.pic)
                    .apply(RequestOptions.bitmapTransform(MultiTransformation(BlurTransformation(90))))
                    .into(ivBlur)
                    tvBanType.text = bean.banType
                    llDislike.visibility = View.VISIBLE
                    llRoot.visibility = View.GONE
            } else {
                Glide.with(context)
                    .load(bean.pic)
                    .into(ivCover)
                    llDislike.visibility = View.GONE
                    llRoot.visibility = View.VISIBLE
                    llRoot.startAnimation(AnimationUtils.loadAnimation(context, R.anim.anim_fade_in))
            }
            tvTitle.text = bean.title
            tvUpName.text = bean.owner.name
            tvPlayNum.text = CalculationUtils.formatNum(bean.stat.view)
            tvDanMu.text = CalculationUtils.formatNum(bean.stat.danmaku)
            tvDuration.text = CalculationUtils.formatDuration(bean.duration)
            llRoot.setOnClickListener {
                onItemClickListener(it, position)
            }
            llRoot.setOnLongClickListener {
                onItemLongClickListener(it, position)
                true
            }
            llReset.setOnClickListener {
                bean.isDismiss = false
                notifyItemChanged(position)
            }
            ivSetting.setOnClickListener {
                onItemLongClickListener(it, position)
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}