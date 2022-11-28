package com.example.figmapracticeapp.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.figmapracticeapp.databinding.ActivityMovieScreenBinding
import com.example.figmapracticeapp.ui.model.DotsIndicator


class MovieScreenActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMovieScreenBinding
//    private var navGraph : NavGraph? = null
    private var navController : NavController? = null

    fun getDotIndicator() : DotsIndicator = binding.toolbarLayout.dotsIndicator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMovieScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.toolbarLayout.ivBackBtn.setOnClickListener {
            //On back arrow press move back to DashBoard Activity
            navController = binding.frgContainer1.getFragment<NavHostFragment>().navController
            val isStackPopped = navController!!.popBackStack() // Navigate back to the last fragment
            if (!isStackPopped) finish() // If there is no fragments in the stack finish the activity and go back to activity dashboard
        }
        binding.toolbarLayout.ivCloseBtn.setOnClickListener {

            finish()

        }

    }

}



