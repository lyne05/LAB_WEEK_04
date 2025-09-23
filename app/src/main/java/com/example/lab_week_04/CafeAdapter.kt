package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

val TABS_FIXED = listOf(
    R.string.starbucks_title,
    R.string.janjijiwa_title,
    R.string.kopikenangan_title,
)

val TABS_CONTENT = listOf(
    R.string.starbucks_desc,
    R.string.janjijiwa_desc,
    R.string.kopikenangan_desc,
)

class CafeAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    private val parentFragment = fragment

    override fun getItemCount(): Int {
        return TABS_FIXED.size
    }

    override fun createFragment(position: Int): Fragment {
        val content = parentFragment.requireContext().getString(TABS_CONTENT[position])
        return CafeDetailFragment.newInstance(content)
    }
}
