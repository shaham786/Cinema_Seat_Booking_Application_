package com.example.figmapracticeapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.figmapracticeapp.R
import com.example.figmapracticeapp.ui.model.Fooddata
import com.example.figmapracticeapp.databinding.FragmentViewMovie1Binding
import com.example.figmapracticeapp.ui.activities.MovieScreenActivity
import com.example.figmapracticeapp.ui.adapters.ViewPager2Adapter
import com.google.android.material.tabs.TabLayout

class ViewMovieFragment1 : Fragment() {

    private lateinit var binding : FragmentViewMovie1Binding
    private var dataset = ArrayList<String>()
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout : TabLayout



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle? ): View? {

        binding = FragmentViewMovie1Binding.inflate(layoutInflater,container,false)

        (activity as MovieScreenActivity).getDotIndicator().apply {
            initDots(4)
            setDotSelection(0)
        }

        return binding.root



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewPager = binding.movieScrViewpager2
        tabLayout = binding.movieScrTabLayout

//        val navController = Navigation.findNavController(requireActivity(), R.id.nav)

        val fragments: ArrayList<Fragment> = arrayListOf(
            MovieScheduleFragment{
                findNavController().navigate(R.id.movieTicketSeats);
            }, MovieAboutFragment()
        )
        viewPager.adapter = ViewPager2Adapter(fragments, requireActivity())
        viewPager.offscreenPageLimit = 2
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.currentItem = tab.position
                when (tab.position) {
                    0 -> {
                    }
                    1 -> {
                    }
                }

            }

            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {

                tabLayout.selectTab(tabLayout.getTabAt(position))
                }
        })

        viewPager.isUserInputEnabled = false


        val food1 = requireActivity().intent.getParcelableExtra<Fooddata>("food")
        if (food1 != null) {

            binding.tvMovieView2.text = food1.textView
        }

    }
}