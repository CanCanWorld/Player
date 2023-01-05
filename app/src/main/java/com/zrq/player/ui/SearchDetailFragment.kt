package com.zrq.player.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import com.zrq.player.databinding.FragmentSearchDetailBinding

class SearchDetailFragment : BaseFragment<FragmentSearchDetailBinding>() {
    override fun providedViewBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentSearchDetailBinding {
        return FragmentSearchDetailBinding.inflate(inflater, container, false)
    }

    override fun initData() {
    }

    override fun initEvent() {
    }

}
