package com.zrq.player.ui

import android.view.LayoutInflater
import android.view.MenuItem
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.google.android.material.navigation.NavigationBarView
import com.zrq.player.R
import com.zrq.player.databinding.FragmentBottomBinding

class BottomFragment : BaseFragment<FragmentBottomBinding>() {
    override fun providedViewBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentBottomBinding {
        return FragmentBottomBinding.inflate(inflater, container, false)
    }

    override fun initData() {

    }

    override fun initEvent() {
        mBinding.bottomNavigationView.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener {
            when (it.itemId) {
                R.id.item_home -> {
                    Navigation.findNavController(requireActivity(), R.id.fragment_bottom_container)
                        .navigate(R.id.homeFragment)
                    true
                }
                R.id.item_my -> {
                    Navigation.findNavController(requireActivity(), R.id.fragment_bottom_container)
                        .navigate(R.id.myFragment)
                    true
                }
                else -> false
            }
        })
    }

}