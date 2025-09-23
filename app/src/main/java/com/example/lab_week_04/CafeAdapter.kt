package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

val TABS_FIXED = listOf(
    R.string.starbucks_title,
    R.string.janjijiwa_title,
    R.string.kopikenangan_title,
)
class CafeAdapter(fragment: Fragment) :
    FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return TABS_FIXED.size
    }
    override fun createFragment(position: Int): Fragment
    {
        return CafeDetailFragment()
    }
}
