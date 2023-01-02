package com.zrq.player.ui

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.google.gson.Gson
import com.zrq.player.R
import com.zrq.player.adapter.RegionAdapter
import com.zrq.player.bean.Region
import com.zrq.player.bean.RegionVideo
import com.zrq.player.bean.Video
import com.zrq.player.databinding.FragmentPartitionBinding
import com.zrq.player.utils.Constants.BASE_URL
import com.zrq.player.utils.Constants.REGION
import com.zrq.player.utils.HttpUtil

class PartitionFragment(
    private val region: Region
) : BaseFragment<FragmentPartitionBinding>() {
    override fun providedViewBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentPartitionBinding {
        return FragmentPartitionBinding.inflate(inflater, container, false)
    }

    private val list = mutableListOf<RegionVideo.DataBean.ArchivesBean>()
    private lateinit var adapter: RegionAdapter

    override fun initData() {
        Log.d(TAG, "initData: ")
        adapter = RegionAdapter(requireContext(), list, { _, position ->
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
            showBottomView()
        })
        loadPopular()
        mBinding.apply {
            recyclerView.adapter = adapter
        }
    }

    private fun showBottomView() {

    }

    @SuppressLint("NotifyDataSetChanged")
    private fun loadPopular() {
        val url = "$BASE_URL$REGION?rid=${region.tid}&pn=1&ps=30"
        HttpUtil.httpGet(url) { success, msg ->
            if (success) {
                val popular = Gson().fromJson(msg, RegionVideo::class.java)
                list.clear()
                list.addAll(popular.data.archives)
                adapter.notifyDataSetChanged()
            } else {
                Toast.makeText(requireContext(), msg, Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun initEvent() {
    }

    companion object {
        private const val TAG = "PartitionFragment"
    }

}
