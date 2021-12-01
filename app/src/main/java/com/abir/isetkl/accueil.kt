package com.abir.isetkl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import com.google.android.material.bottomnavigation.BottomNavigationView

class accueil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accueil)
        lateinit var homeFragment: homeFragment
        lateinit var mapsFragment: mapsFragment
        lateinit var forumFragment: forumFragment
        lateinit var profileFragment: profilFragment
        var bottomnav: BottomNavigationView = findViewById<BottomNavigationView>(R.id.BottomNavMenu)
        var frame: FrameLayout = findViewById<FrameLayout>(R.id.framelLayout)
        bottomnav.setOnNavigationItemReselectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    homeFragment = homeFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.framelLayout, homeFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.maps -> {
                    mapsFragment = mapsFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.framelLayout, mapsFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.message -> {
                    forumFragment = forumFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.framelLayout, forumFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.profile -> {
                    profileFragment = profilFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.framelLayout, profileFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
            }


        }

    }
}