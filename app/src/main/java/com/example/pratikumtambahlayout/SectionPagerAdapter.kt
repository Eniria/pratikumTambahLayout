package com.example.pratikumtambahlayout

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class SectionPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        var fragment : Fragment? = null
        when(position){
            0 -> fragment = HomeFragment()
            1 -> fragment = ProfileFragment()
            2 -> fragment = CallHistoryFragment()
        }
        return fragment as Fragment
    }
}