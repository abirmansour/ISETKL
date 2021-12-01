package com.abir.isetkl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class inscrire : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscrire)
        val imageView5ImageView = findViewById<ImageView>(R.id.imageView5)
        imageView5ImageView.setOnClickListener {
            val Intent = Intent(this, etudiant::class.java)
            startActivity(Intent)
        }
        val imageView6ImageView = findViewById<ImageView>(R.id.imageView6)
        imageView6ImageView.setOnClickListener {
            val Intent = Intent(this, ensegiente::class.java)
            startActivity(Intent)
        }
    }
}