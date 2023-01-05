package com.zrq.player.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import com.google.gson.Gson
import com.zrq.player.bean.Search
import com.zrq.player.databinding.FragmentSearchResultBinding
import com.zrq.player.utils.Constants.BASE_URL
import com.zrq.player.utils.Constants.SEARCH
import com.zrq.player.utils.HttpUtil.httpGet

class SearchResultFragment : BaseFragment<FragmentSearchResultBinding>() {
    override fun providedViewBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentSearchResultBinding {
        return FragmentSearchResultBinding.inflate(inflater, container, false)
    }

    private var keyword = ""
    private val list = mutableListOf<Search.DataDTO.ResultDTO>()

    override fun initData() {
        keyword = mainModel.keyword
    }

    override fun initEvent() {
    }

    fun loadSearch() {
        val url = "$BASE_URL$SEARCH?keyword=$keyword"
        httpGet(url) { success, msg ->
            if (success) {
                val search = Gson().fromJson(msg, Search::class.java)
                search?.data?.result?.let {
                    list.clear()
                    list.addAll(it)
                }
            } else {
                Toast.makeText(requireContext(), msg, Toast.LENGTH_SHORT).show()
            }
        }
    }

}
