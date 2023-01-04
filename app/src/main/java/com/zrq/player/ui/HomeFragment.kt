package com.zrq.player.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.google.android.material.tabs.TabLayoutMediator
import com.zrq.player.R
import com.zrq.player.adapter.PartitionAdapter
import com.zrq.player.databinding.FragmentHomeBinding
import com.zrq.player.utils.Constants


class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override fun providedViewBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater, container, false)
    }


    private lateinit var adapter: PartitionAdapter

    override fun initData() {
        adapter = PartitionAdapter(requireActivity(), Constants.getRegion())
        mBinding.apply {
            viewPager.offscreenPageLimit = 6
            viewPager.adapter = adapter
            TabLayoutMediator(tabLayout, viewPager, true) { tab, position ->
                tab.text = Constants.getRegion()[position].title
            }.attach()
        }
    }

    override fun initEvent() {
        mBinding.apply {
            ivSelectRegion.setOnClickListener {
                Navigation.findNavController(requireActivity(), R.id.fragment_container)
                    .navigate(R.id.regionItemFragment)
            }
        }
    }

    companion object {
        private const val TAG = "HomeFragment"
    }

}
