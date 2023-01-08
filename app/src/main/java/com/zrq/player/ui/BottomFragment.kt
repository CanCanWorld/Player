package com.zrq.player.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import com.zrq.player.databinding.FragmentBottomBinding

class BottomFragment : BaseFragment<FragmentBottomBinding>() {
    override fun providedViewBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentBottomBinding {
        return FragmentBottomBinding.inflate(inflater, container, false)
    }

    override fun initData() {

    }

    override fun initEvent() {

    }

}