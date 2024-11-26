package com.example.task_032

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class RoleAdapter(
    fragment: FragmentActivity,
    private val roleList: MutableList<Role>
):
    FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return roleList.size
    }

    override fun createFragment(position: Int): Fragment {
        val fragment = ViewPagerFragment()
        fragment.arguments = bundleOf("role" to roleList[position])
        return  fragment
    }
}