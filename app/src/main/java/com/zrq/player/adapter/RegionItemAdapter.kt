package com.zrq.player.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zrq.player.bean.Region
import com.zrq.player.databinding.ItemRegionBinding

class RegionItemAdapter(
    private val context: Context,
    private val list: MutableList<Region>,
) : RecyclerView.Adapter<VH<ItemRegionBinding>>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH<ItemRegionBinding> {
        return VH(ItemRegionBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    override fun onBindViewHolder(holder: VH<ItemRegionBinding>, position: Int) {
        val bean = list[position]
        holder.binding.apply {
            ivIcon.setImageResource(bean.iconPath)
            tvTitle.text = bean.title
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}