package com.zrq.player.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.zrq.player.bean.Related
import com.zrq.player.databinding.ItemRelatedBinding

class RelatedAdapter(
    private val context: Context,
    private val list: MutableList<Related.DataDTO>,
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
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}