package com.zrq.player.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.zrq.player.bean.Comment
import com.zrq.player.databinding.ItemCommentBinding

class CommentAdapter(
    private val context: Context,
    private val list: MutableList<Comment.DataBean.RepliesBean>,
    private val onItemClickListener: (View, Int) -> Unit
) : RecyclerView.Adapter<VH<ItemCommentBinding>>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH<ItemCommentBinding> {
        return VH(ItemCommentBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    override fun onBindViewHolder(holder: VH<ItemCommentBinding>, position: Int) {
        val bean = list[position]
        holder.binding.apply {
            Glide.with(context)
                .load(bean.member.avatar)
                .into(ivFace)
            tvUpName.text = bean.member.uname
            tvCommentInfo.text = bean.content.message
            tvLikeNum.text = bean.like.toString()
            tvUpDetail.text = bean.reply_control.time_desc
            root.setOnClickListener {
                onItemClickListener(it, position)
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}