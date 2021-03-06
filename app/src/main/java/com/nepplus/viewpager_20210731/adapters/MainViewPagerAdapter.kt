package com.nepplus.viewpager_20210731.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.nepplus.viewpager_20210731.fragments.HelloFragment
import com.nepplus.viewpager_20210731.fragments.MyinfoFragment
import com.nepplus.viewpager_20210731.fragments.NameFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when( position ) {
            0 -> NameFragment()
            1 -> MyinfoFragment()
            else -> HelloFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "이름"
            1 -> "정보"
            else -> "인삿말"
        }
    }
}