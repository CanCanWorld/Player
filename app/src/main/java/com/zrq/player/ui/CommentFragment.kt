package com.zrq.player.ui

import android.annotation.SuppressLint
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import com.google.gson.Gson
import com.zrq.player.adapter.CommentAdapter
import com.zrq.player.bean.Comment
import com.zrq.player.bean.Detail
import com.zrq.player.databinding.FragmentCommentBinding
import com.zrq.player.utils.Constants.BASE_URL
import com.zrq.player.utils.Constants.REPLY
import com.zrq.player.utils.HttpUtil.httpGet

class CommentFragment : BaseFragment<FragmentCommentBinding>() {
    override fun providedViewBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentCommentBinding {
        return FragmentCommentBinding.inflate(inflater, container, false)
    }

    private var detail: Detail.DataBean? = null
    private lateinit var adapter: CommentAdapter
    private val list = mutableListOf<Comment.DataBean.RepliesBean>()


    override fun initData() {
        adapter = CommentAdapter(requireContext(), list) { _, position ->

        }
        mBinding.apply {
            recyclerView.adapter = adapter
        }
        mainModel.detail.observe(this) {
            detail = it
            initComment()
        }
    }

    override fun initEvent() {
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun initComment() {
        detail?.let { detail ->
            if (detail.reply?.replies == null) return
            val oid = detail.reply.replies[0].oid
            val url = "$BASE_URL$REPLY?type=1&oid=$oid"
            httpGet(url) { success, msg ->
                if (success) {
                    val comment = Gson().fromJson(msg, Comment::class.java)
                    comment?.data?.replies?.let {
                        list.clear()
                        list.addAll(it)
                        Handler(Looper.getMainLooper()).post {
                            adapter.notifyDataSetChanged()
                        }
                    }
                } else {
                    Handler(Looper.getMainLooper()).post {
                        Toast.makeText(requireContext(), msg, Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }

}
