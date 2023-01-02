package com.zrq.player.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.zrq.player.bean.Popular
import com.zrq.player.databinding.ItemVideoBinding

class PopularAdapter(
    private val context: Context,
    private val list: MutableList<Popular.DataDTO.ListDTO>,
    private val onItemClickListener: (View, Int) -> Unit
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
            root.setOnClickListener {
                onItemClickListener(it, position)
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}