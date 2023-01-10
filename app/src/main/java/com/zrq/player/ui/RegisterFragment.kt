package com.zrq.player.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import com.zrq.player.databinding.FragmentRegisterBinding
import com.zrq.player.utils.Constants

class RegisterFragment(
    private val onPageChangeListener: (Int) -> Unit
) : BaseFragment<FragmentRegisterBinding>() {
    override fun providedViewBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentRegisterBinding {
        return FragmentRegisterBinding.inflate(inflater, container, false)
    }

    override fun initData() {
    }

    override fun initEvent() {
        mBinding.apply {
            llToLogin.setOnClickListener {
                onPageChangeListener(Constants.PAGE_LOGIN)
            }
        }
    }

}
