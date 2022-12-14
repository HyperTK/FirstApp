package com.tk.firstapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.tk.firstapp.fragment.Tab1Fragment
import com.tk.firstapp.fragment.Tab2Fragment
import com.tk.firstapp.fragment.Tab3Fragment

private const val NUM_TABS = 3

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return NUM_TABS
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> Tab1Fragment()
            1 -> Tab2Fragment()
            else -> Tab3Fragment()
        }
    }

}