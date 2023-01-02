package com.zrq.player.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.zrq.player.bean.Region
import com.zrq.player.ui.PartitionFragment

class PartitionAdapter(
    private val fragmentActivity: FragmentActivity,
    private val list: MutableList<Region>,
) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment {
        return PartitionFragment(list[position])
    }
}
