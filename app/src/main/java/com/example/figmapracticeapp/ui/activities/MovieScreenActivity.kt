package com.example.figmapracticeapp.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.fragment.NavHostFragment
import com.example.figmapracticeapp.databinding.ActivityMovieScreenBinding
import com.example.figmapracticeapp.databinding.FragmentViewMovie1Binding
import com.google.android.material.tabs.TabLayoutMediator


class MovieScreenActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMovieScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMovieScreenBinding.inflate(layoutInflater)

        setContentView(binding.root)

//        val navHost = supportFragmentManager.findFragmentById(R.id.frg_container1) as NavHostFragment?
//        val navController = navHost?.navController
//        navController?.setGraph(R.navigation.nav)
    }

}



