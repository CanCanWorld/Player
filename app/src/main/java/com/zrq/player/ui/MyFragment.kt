package com.zrq.player.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.zrq.player.R
import com.zrq.player.databinding.FragmentMyBinding
import com.zrq.player.view.LoginBottomDialog

class MyFragment : BaseFragment<FragmentMyBinding>() {
    override fun providedViewBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentMyBinding {
        return FragmentMyBinding.inflate(inflater, container, false)
    }

    override fun initData() {

    }

    override fun initEvent() {
        mBinding.apply {
            ivFace.setOnClickListener {
                tvUsername.callOnClick()
            }
            tvUsername.setOnClickListener {
                val loginBottomDialog = LoginBottomDialog(requireContext(), requireActivity())
                loginBottomDialog.show()
                loginBottomDialog.behavior.apply {
                    state = BottomSheetBehavior.STATE_EXPANDED
                    peekHeight = 3000
                }
            }
        }
    }

}
