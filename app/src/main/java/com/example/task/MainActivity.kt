package com.example.task

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.task.account.AccountFragment
import com.example.task.cart.CardFragment
import com.example.task.home.HomeFragment
import com.example.task.search.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private var titleTv: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }

        setContentView(R.layout.activity_main)

        val navBar = findViewById<BottomNavigationView>(R.id.nav_bar)
        navBar.selectedItemId = R.id.item_home

        supportFragmentManager.beginTransaction()
            .replace(R.id.container_layout, HomeFragment())
            .commit()

        titleTv = findViewById(R.id.tv_title)

        navBar.setOnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.item_home -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container_layout, HomeFragment())
                        .commit()

                    setTitleTxt("Home")
                    true
                }
                R.id.item_search -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container_layout, SearchFragment())
                        .commit()

                    setTitleTxt("Search")
                    true
                }
                R.id.item_card -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container_layout, CardFragment())
                        .commit()

                    setTitleTxt("My Cart")
                    true
                }
                R.id.item_account -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container_layout, AccountFragment())
                        .commit()

                    setTitleTxt("My Profile")
                    true
                }
                else -> false
            }
        }
    }

    private fun setTitleTxt(title: String) {
        titleTv?.text = title
    }
}