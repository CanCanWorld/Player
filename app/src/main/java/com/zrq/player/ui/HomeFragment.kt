package com.zrq.player.ui

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.google.gson.Gson
import com.zrq.player.R
import com.zrq.player.adapter.PopularAdapter
import com.zrq.player.bean.Popular
import com.zrq.player.bean.Video
import com.zrq.player.databinding.FragmentHomeBinding
import com.zrq.player.utils.Constants.BASE_URL
import com.zrq.player.utils.Constants.POPULAR
import com.zrq.player.utils.HttpUtil.httpGet

class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override fun providedViewBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater, container, false)
    }

    private val list = mutableListOf<Popular.DataDTO.ListDTO>()
    private lateinit var adapter: PopularAdapter

    override fun initData() {
        loadPopular()
        adapter = PopularAdapter(requireContext(), list) { _, position ->
            val bean = list[position]
            mainModel.videos.push(Video(bean.title, bean.bvid, bean.cid))
            Navigation.findNavController(requireActivity(), R.id.fragment_container)
                .navigate(R.id.playerFragment)
        }
        mBinding.apply {
            recyclerView.adapter = adapter
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun loadPopular() {
        val url = "$BASE_URL$POPULAR"
        httpGet(url) { success, msg ->
            if (success) {
                Log.d(TAG, "loadPopular: $msg")
                val popular = Gson().fromJson(msg, Popular::class.java)
                list.clear()
                list.addAll(popular.data.list)
                adapter.notifyDataSetChanged()
            } else {
                Toast.makeText(requireContext(), msg, Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun initEvent() {
    }

    companion object {
        private const val TAG = "HomeFragment"
    }

}
