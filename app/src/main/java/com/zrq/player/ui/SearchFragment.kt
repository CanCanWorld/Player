package com.zrq.player.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
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
            etSearch.setOnEditorActionListener { _, actionId, _ ->
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    tvSearch.callOnClick()
                    val imm = requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                    imm.hideSoftInputFromWindow(requireActivity().window.decorView.windowToken, 0)
                }
                false
            }
            ivBack.setOnClickListener {
                Navigation.findNavController(requireActivity(), R.id.fragment_container)
                    .popBackStack()
            }
        }
        mainModel.etText.observe(this) {
            mBinding.etSearch.setText(it)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mBinding.etSearch.setText("")
        mainModel.etText.postValue("")
    }

}
