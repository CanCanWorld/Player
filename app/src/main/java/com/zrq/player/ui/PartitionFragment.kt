package com.zrq.player.ui

import android.annotation.SuppressLint
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.gson.Gson
import com.zrq.player.R
import com.zrq.player.adapter.HomeVideoAdapter
import com.zrq.player.bean.Region
import com.zrq.player.bean.RegionVideo
import com.zrq.player.bean.Video
import com.zrq.player.databinding.BottomVideoSettingBinding
import com.zrq.player.databinding.FragmentPartitionBinding
import com.zrq.player.utils.Constants.BASE_URL
import com.zrq.player.utils.Constants.REGION
import com.zrq.player.utils.HttpUtil
import com.zrq.player.view.HideBottomDialog

class PartitionFragment(
    private val region: Region
) : BaseFragment<FragmentPartitionBinding>() {
    override fun providedViewBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentPartitionBinding {
        return FragmentPartitionBinding.inflate(inflater, container, false)
    }

    private val list = mutableListOf<RegionVideo.DataBean.ArchivesBean>()
    private lateinit var adapter: HomeVideoAdapter
    private var page = 1
    private var num = 1
    private var randomRange = 4
    private val pageCount = 30

    @SuppressLint("NotifyDataSetChanged")
    override fun initData() {
        adapter = HomeVideoAdapter(requireContext(), list, { _, position ->
            val bean = list[position]
            mainModel.videos.push(
                Video(
                    bean.title, bean.bvid, bean.cid, bean.pubdate, bean.pub_location,
                    bean.stat.view, bean.stat.danmaku, bean.stat.reply, bean.stat.favorite, bean.stat.coin, bean.stat.share,
                    bean.stat.now_rank, bean.stat.his_rank, bean.stat.like, bean.stat.dislike, bean.owner.name, bean.owner.face
                )
            )
            Navigation.findNavController(requireActivity(), R.id.fragment_container)
                .navigate(R.id.playerFragment)
        }, { _, position ->
            val hideBottomDialog = HideBottomDialog(requireContext(), requireActivity(), list[position]) {
                adapter.notifyItemChanged(position)
            }
            hideBottomDialog.show()
        })
        loadVideo()
        mBinding.apply {
            recyclerView.adapter = adapter
        }
    }

    override fun initEvent() {
        mBinding.refreshLayout.setOnRefreshListener {
            num++
            page = num % randomRange + 1  //1,2,3,4
            loadVideo()
        }
        mBinding.refreshLayout.setOnLoadMoreListener {
            num++
            page = num % randomRange + 1  //1,2,3,4
            loadVideo()
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun loadVideo() {
        Log.d(TAG, "page: $page")
        val url = "$BASE_URL$REGION?rid=${region.tid}&pn=$page&ps=$pageCount"
        HttpUtil.httpGet(url) { success, msg ->
            if (success) {
                val popular = Gson().fromJson(msg, RegionVideo::class.java)
                randomRange = popular.data.page.count / pageCount
                Log.d(TAG, "randomRange: $randomRange")
                popular?.data?.archives?.let {
                    if (mBinding.refreshLayout.isRefreshing)
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
            mBinding.refreshLayout.finishRefresh()
            mBinding.refreshLayout.finishLoadMore()
        }
    }

    companion object {
        private const val TAG = "PartitionFragment"
    }
}
