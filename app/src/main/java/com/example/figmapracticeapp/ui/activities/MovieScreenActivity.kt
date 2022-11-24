package com.example.figmapracticeapp.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.NavController.OnDestinationChangedListener
import androidx.navigation.NavGraph
import androidx.navigation.fragment.NavHostFragment
import com.example.figmapracticeapp.R
import com.example.figmapracticeapp.databinding.ActivityMovieScreenBinding
import com.example.figmapracticeapp.ui.model.DotsIndicator


class MovieScreenActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMovieScreenBinding
    private var navGraph : NavGraph? = null
    private var navController : NavController? = null
    fun getDotIndicator() : DotsIndicator = findViewById(R.id.dotsIndicator)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMovieScreenBinding.inflate(layoutInflater)



//       getDotIndicator().initDots(3)
//        navController!!.addOnDestinationChangedListener( OnDestinationChangedListener { controller, destination, arguments ->
//
//            when(destination.id)
//            {
//                R.id.movieTicketSeats ->
//                {
//                    getDotIndicator().setDotSelection(2)
//                }
//            }
//
//
//        } )
//
//


        binding.toolbarLayout.ivBackBtn.setOnClickListener {
            //On back arrow press move back to DashBoard Activity
            navController =  binding.frgContainer1.getFragment<NavHostFragment>().navController
            val isStackPopped = navController!!.popBackStack() // Navigate back to the last fragment
            if (!isStackPopped) finish() // If there is no fragments in the stack finish the activity and go back to activity dashboard
           }
        binding.toolbarLayout.ivCloseBtn.setOnClickListener {

            finish()

        }
        setContentView(binding.root)

//        val navHost = supportFragmentManager.findFragmentById(R.id.frg_container1) as NavHostFragment?
//        val navController = navHost?.navController
//        navController?.setGraph(R.navigation.nav)
    }

}



