package com.zrq.player.ui

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.navigation.Navigation
import com.bumptech.glide.Glide
import com.zrq.player.R
import com.zrq.player.adapter.RelatedAdapter
import com.zrq.player.bean.Detail
import com.zrq.player.bean.RelateDao
import com.zrq.player.databinding.FragmentRelatedBinding
import com.zrq.player.utils.CalculationUtils.formatNum
import com.zrq.player.view.RelatedHideBottomDialog
import java.text.SimpleDateFormat
import java.util.*

class RelatedFragment : BaseFragment<FragmentRelatedBinding>() {
    override fun providedViewBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentRelatedBinding {
        return FragmentRelatedBinding.inflate(inflater, container, false)
    }

    private val list = mutableListOf<RelateDao>()
    private lateinit var adapter: RelatedAdapter
    private var detail: Detail.DataBean? = null

    @SuppressLint("NotifyDataSetChanged")
    override fun initData() {

        adapter = RelatedAdapter(requireContext(), list, { _, position ->
            Log.d(TAG, "initData: ${list[position]}")
            mainModel.bvids.push(list[position].bvid)
            Navigation.findNavController(requireActivity(), R.id.fragment_container)
                .navigate(R.id.playerFragment)
        }, { _, position ->
            val hideBottomDialog = RelatedHideBottomDialog(requireContext(), requireActivity(), list[position]) {
                adapter.notifyItemChanged(position)
            }
            hideBottomDialog.show()
        })
        mBinding.apply {
            recyclerView.adapter = adapter
        }
        mainModel.detail.observe(this) {
            detail = it
            initDetail()
            initRelated()
        }

    }

    override fun initEvent() {
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun initRelated() {
        detail?.let { detail ->
            list.clear()
            list.addAll(detail.related)
            adapter.notifyDataSetChanged()
        }
    }


    @SuppressLint("SetTextI18n")
    private fun initDetail() {
        mBinding.apply {
            recyclerView.adapter = adapter
            detail?.let { detail ->
                Glide.with(this@RelatedFragment)
                    .load(detail.card.card.face)
                    .into(ivFace)
                tvName.text = detail.card.card.name
                tvDetail.text = formatNum(detail.card.follower) + "粉丝   " + formatNum(detail.card.archive_count) + "视频"
                tvTitle.text = detail.view.title
                tvPlayNum.text = formatNum(detail.view.stat.view)
                tvDanMu.text = formatNum(detail.view.stat.danmaku)
                tvPublishTime.text = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.CHINA).format(Date(detail.view.pubdate * 1000))
                rlExpand.setOnClickListener {
                    if (rlDetail.visibility == View.GONE) {
                        rlDetail.visibility = View.VISIBLE
                        rlDetail.startAnimation(AnimationUtils.loadAnimation(requireContext(), R.anim.anim_big_from_top))
                        tvTitle.maxLines = 99
                        ivExpand.setImageResource(R.drawable.ic_baseline_expand_less_24)
                    } else {
                        rlDetail.visibility = View.GONE
                        tvTitle.maxLines = 1
                        ivExpand.setImageResource(R.drawable.ic_baseline_expand_more_24)
                    }
                }
                tvBvid.text = detail.view.bvid
                llCopyright.visibility = if (detail.view.copyright == 1L) View.VISIBLE else View.GONE
                tvIntro.text = if ((detail.view.desc_v2?.size ?: 0) > 0) detail.view.desc_v2[0].raw_text else ""
                detail.tags.forEach {
                    val view = LayoutInflater.from(requireContext()).inflate(R.layout.item_flow, null)
                    view.tag = it.tag_name
                    view.findViewById<TextView>(R.id.tv_title).text = it.tag_name
                    flowLayout.addView(view)
                }
            }
        }
    }

    companion object {
        private const val TAG = "RelatedFragment"
    }
}
