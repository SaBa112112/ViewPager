package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager.adapters.ViewPagerFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

private lateinit var viewPager2: ViewPager2
private lateinit var tabLayout: TabLayout
private lateinit var viewPagerFragmentAdapter: ViewPagerFragmentAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager2 = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabLayout)
        viewPagerFragmentAdapter = ViewPagerFragmentAdapter(this)

        viewPager2.adapter = viewPagerFragmentAdapter

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            tab.text = "Tab ${position + 1}"
        }.attach()
    }
}