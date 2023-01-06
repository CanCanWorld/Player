package com.zrq.player.ui

import android.annotation.SuppressLint
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import com.google.gson.Gson
import com.zrq.player.adapter.HotSearchAdapter
import com.zrq.player.bean.HotSearch
import com.zrq.player.databinding.FragmentSearchDetailBinding
import com.zrq.player.utils.Constants.HOT_SEARCH
import com.zrq.player.utils.HttpUtil.httpGet

class SearchDetailFragment : BaseFragment<FragmentSearchDetailBinding>() {
    override fun providedViewBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentSearchDetailBinding {
        return FragmentSearchDetailBinding.inflate(inflater, container, false)
    }

    private val list = mutableListOf<HotSearch.ListBean>()
    private lateinit var adapter: HotSearchAdapter

    override fun initData() {
        loadHotSearch()
        adapter = HotSearchAdapter(requireContext(), list) { _, position ->
            mainModel.etText.postValue(list[position].keyword)
        }
        mBinding.apply {
            recyclerView.adapter = adapter
        }
    }

    override fun initEvent() {

    }

    @SuppressLint("NotifyDataSetChanged")
    private fun loadHotSearch() {
        httpGet(HOT_SEARCH) { success, msg ->
            if (success) {
                val hotSearch = Gson().fromJson(msg, HotSearch::class.java)
                hotSearch?.list?.let {
                    list.clear()
                    list.addAll(it)
                }
                Handler(Looper.getMainLooper()).post {
                    adapter.notifyDataSetChanged()
                }
            } else {
                Handler(Looper.getMainLooper()).post {
                    Toast.makeText(requireContext(), msg, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

}
