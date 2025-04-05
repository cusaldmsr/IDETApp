package com.cusaldev.idetapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.cusaldev.idetapp.bottomBar.ChatFragment
import com.cusaldev.idetapp.bottomBar.FriendsFragment
import com.cusaldev.idetapp.bottomBar.HomeFragment
import com.cusaldev.idetapp.bottomBar.VideoFragment
import com.cusaldev.idetapp.databinding.ActivityTabLayBinding
import com.google.android.material.tabs.TabLayoutMediator

class TabLayActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTabLayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTabLayBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val fragmentList = listOf(
            HomeFragment(),
            FriendsFragment(),
            VideoFragment(),
            ChatFragment()
        )
        val fragmentAdapter = FragmentAdapter(supportFragmentManager, lifecycle)

        fragmentAdapter.setFragments(fragmentList)
        binding.pager.adapter = fragmentAdapter

        TabLayoutMediator(binding.tabLayout,binding.pager){tab,position->
            tab.text = when(position){
                0 -> "Home"
                1 -> "Friends"
                2 -> "Video"
                3 -> "Chats"
                else -> ""
            }

        }.attach()


    }
}