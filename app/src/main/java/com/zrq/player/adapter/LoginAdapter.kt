package com.zrq.player.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.zrq.player.ui.LoginFragment
import com.zrq.player.ui.RegisterFragment
import com.zrq.player.utils.Constants.PAGE_LOGIN
import com.zrq.player.utils.Constants.PAGE_REGISTER

class LoginAdapter(
    private val fragmentActivity: FragmentActivity,
    private val onPageChangeListener: (Int) -> Unit
) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            PAGE_LOGIN -> LoginFragment() {
                onPageChangeListener(it)
            }
            else -> RegisterFragment() {
                onPageChangeListener(it)
            }
        }
    }
}
