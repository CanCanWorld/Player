package com.zrq.player.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.zrq.player.bean.Comment
import com.zrq.player.bean.HotSearch
import com.zrq.player.databinding.ItemCommentBinding
import com.zrq.player.databinding.ItemHotSearchBinding

class HotSearchAdapter(
    private val context: Context,
    private val list: MutableList<HotSearch.ListBean>,
    private val onItemClickListener: (View, Int) -> Unit
) : RecyclerView.Adapter<VH<ItemHotSearchBinding>>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH<ItemHotSearchBinding> {
        return VH(ItemHotSearchBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    override fun onBindViewHolder(holder: VH<ItemHotSearchBinding>, position: Int) {
        val bean = list[position]
        holder.binding.apply {
            tvTitle.text = bean.keyword
            root.setOnClickListener {
                onItemClickListener(it, position)
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}