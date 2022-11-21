package com.example.figmapracticeapp.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.figmapracticeapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val imagebtn = findViewById<ImageView>(R.id.iv_movie_image)
        imagebtn.setOnClickListener{
            val intent = Intent(this@MainActivity, MovieSearchActivity::class.java)
            startActivity(intent)
        }
    }
}