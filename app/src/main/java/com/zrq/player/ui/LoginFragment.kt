package com.zrq.player.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import com.zrq.player.databinding.FragmentLoginBinding
import com.zrq.player.utils.Constants.PAGE_REGISTER

class LoginFragment(
    private val onPageChangeListener: (Int) -> Unit
) : BaseFragment<FragmentLoginBinding>() {
    override fun providedViewBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentLoginBinding {
        return FragmentLoginBinding.inflate(inflater, container, false)
    }

    override fun initData() {
        mBinding.apply { }
    }

    override fun initEvent() {
        mBinding.apply {
            llToRegister.setOnClickListener {
                onPageChangeListener(PAGE_REGISTER)
            }
            btnLogin.setOnClickListener { }
        }
    }

}
