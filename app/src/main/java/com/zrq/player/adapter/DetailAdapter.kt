package com.zrq.player.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.zrq.player.ui.CommentFragment
import com.zrq.player.ui.RelatedFragment

class DetailAdapter(
    private val fragmentActivity: FragmentActivity,
) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return if (position == 0) {
            RelatedFragment()
        }else{
            CommentFragment()
        }
    }
}
