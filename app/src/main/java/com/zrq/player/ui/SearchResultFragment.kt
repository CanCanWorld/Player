package com.zrq.player.ui

import android.annotation.SuppressLint
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import com.google.gson.Gson
import com.zrq.player.adapter.SearchAdapter
import com.zrq.player.bean.Search
import com.zrq.player.databinding.FragmentSearchResultBinding
import com.zrq.player.utils.Constants.BASE_URL
import com.zrq.player.utils.Constants.SEARCH
import com.zrq.player.utils.HttpUtil.getCookie
import com.zrq.player.utils.HttpUtil.httpGet

class SearchResultFragment : BaseFragment<FragmentSearchResultBinding>() {
    override fun providedViewBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentSearchResultBinding {
        return FragmentSearchResultBinding.inflate(inflater, container, false)
    }

    private val list = mutableListOf<Search.DataBean.ResultBean>()
    private lateinit var adapter: SearchAdapter

    override fun initData() {
        adapter = SearchAdapter(requireContext(), list, { _, position -> }, { _, position -> })
        mBinding.apply {
            recyclerView.adapter = adapter
        }

    }

    override fun initEvent() {
        mainModel.keyword.observe(this) {
            loadSearch(it)
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun loadSearch(keyword: String) {
        val url = "$BASE_URL$SEARCH?search_type=video&keyword=$keyword&page=1"
        httpGet(url) { success, msg ->
            if (success) {
                val search = Gson().fromJson(msg, Search::class.java)
                search?.data?.result?.let {
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
                getCookie() { success, _ ->
                    if (success) {
                        loadSearch(keyword)
                    }
                }
            }
        }
    }

}
