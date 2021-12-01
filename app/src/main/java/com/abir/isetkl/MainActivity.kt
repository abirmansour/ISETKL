package com.abir.isetkl

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    lateinit var homeFragment: homeFragment
    lateinit var mapsFragment: mapsFragment
    lateinit var forumFragment: forumFragment
    lateinit var profileFragment: profilFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1button = findViewById<Button>(R.id.button1)


        button1button.setOnClickListener {
            val Intent = Intent(this, connecter::class.java)
            startActivity(Intent)
        }
        val button2button = findViewById<Button>(R.id.button2)
        button2button.setOnClickListener {
            val Intent = Intent(this, inscrire::class.java)
            startActivity(Intent)
        }
    }
}







