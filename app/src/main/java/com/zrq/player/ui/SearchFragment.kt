package com.zrq.player.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.zrq.player.R
import com.zrq.player.databinding.FragmentSearchBinding

class SearchFragment : BaseFragment<FragmentSearchBinding>() {
    override fun providedViewBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentSearchBinding {
        return FragmentSearchBinding.inflate(inflater, container, false)
    }

    override fun initData() {
        mBinding.apply {

        }
    }

    override fun initEvent() {
        mBinding.apply {
            tvSearch.setOnClickListener {
                val keyword = etSearch.text.toString()
                if ("" == keyword) {
                    Toast.makeText(requireContext(), "请输入关键字", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                mainModel.keyword.postValue(keyword)
                Navigation.findNavController(requireActivity(), R.id.fragment_search_container)
                    .navigate(R.id.searchResultFragment)
            }
            ivBack.setOnClickListener {
                Navigation.findNavController(requireActivity(), R.id.fragment_container)
                    .popBackStack()
            }
        }
    }

}
