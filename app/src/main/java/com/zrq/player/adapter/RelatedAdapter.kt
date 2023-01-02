package com.zrq.player.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.zrq.player.bean.RelateDao
import com.zrq.player.bean.Related
import com.zrq.player.databinding.ItemRelatedBinding
import com.zrq.player.utils.CalculationUtils

class RelatedAdapter(
    private val context: Context,
    private val list: MutableList<RelateDao>,
    private val onItemClickListener: (View, Int) -> Unit
) : RecyclerView.Adapter<VH<ItemRelatedBinding>>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH<ItemRelatedBinding> {
        return VH(ItemRelatedBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    override fun onBindViewHolder(holder: VH<ItemRelatedBinding>, position: Int) {
        val bean = list[position]
        holder.binding.apply {
            Glide.with(context)
                .load(bean.pic)
                .into(ivCover)
            tvTitle.text = bean.title
            root.setOnClickListener {
                onItemClickListener(it, position)
            }
            tvUpName.text = bean.owner.name
            tvPlayNum.text = CalculationUtils.formatNum(bean.stat.view)
            tvDanMu.text = CalculationUtils.formatNum(bean.stat.danmaku)
            tvDuration.text = CalculationUtils.formatDuration(bean.duration)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}