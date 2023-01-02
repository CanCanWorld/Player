package com.zrq.player.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.zrq.player.R
import com.zrq.player.adapter.RegionItemAdapter
import com.zrq.player.databinding.FragmentRegionItemBinding
import com.zrq.player.utils.Constants

class RegionItemFragment : BaseFragment<FragmentRegionItemBinding>() {
    override fun providedViewBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentRegionItemBinding {
        return FragmentRegionItemBinding.inflate(inflater, container, false)
    }


    private val adapter: RegionItemAdapter by lazy {
        RegionItemAdapter(requireContext(), Constants.regions) { view, position ->

        }
    }

    override fun initData() {
        mBinding.apply {
            recyclerView.adapter = adapter
        }
    }

    override fun initEvent() {
        mBinding.apply {
            ivBack.setOnClickListener {
                Navigation.findNavController(requireActivity(), R.id.fragment_container)
                    .popBackStack()
            }
        }
    }

}
