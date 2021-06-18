package com.example.task.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.task.R
import com.example.task.home.adapters.PagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        val vp = view.findViewById<ViewPager2>(R.id.vp_home)
        vp.isUserInputEnabled = false
        vp.adapter = PagerAdapter(context as FragmentActivity)

        val tb = view.findViewById<TabLayout>(R.id.tab_layout)
        val tbMediator = TabLayoutMediator(tb, vp) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Products"
                    tab.setIcon(R.drawable.menu_book_black)
                }
                1 -> {
                    tab.text = "Shops"
                    tab.setIcon(R.drawable.store_black)
                }
            }
        }

        tbMediator.attach()

        return view
    }
}