package com.zrq.player.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.zrq.player.bean.RegionVideo
import com.zrq.player.databinding.ItemVideoBinding
import com.zrq.player.utils.CalculationUtils

class RegionAdapter(
    private val context: Context,
    private val list: MutableList<RegionVideo.DataBean.ArchivesBean>,
    private val onItemClickListener: (View, Int) -> Unit,
    private val onItemLongClickListener: (View, Int) -> Unit,
) : RecyclerView.Adapter<VH<ItemVideoBinding>>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH<ItemVideoBinding> {
        return VH(ItemVideoBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    override fun onBindViewHolder(holder: VH<ItemVideoBinding>, position: Int) {
        val bean = list[position]
        holder.binding.apply {
            Glide.with(context)
                .load(bean.pic)
                .into(ivCover)
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
            ivSetting.setOnClickListener {
                onItemLongClickListener(it, position)
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}