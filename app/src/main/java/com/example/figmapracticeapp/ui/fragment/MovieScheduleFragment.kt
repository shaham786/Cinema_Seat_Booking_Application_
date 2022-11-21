package com.example.figmapracticeapp.ui.fragment

import android.os.Bundle
import android.os.ProxyFileDescriptorCallback
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.figmapracticeapp.R
import com.example.figmapracticeapp.databinding.FragmentMovieScheduleBinding
import com.example.figmapracticeapp.ui.adapters.DateRecycleViewAdapter
import com.example.figmapracticeapp.ui.adapters.HallRecycleAdapter
import com.example.figmapracticeapp.ui.adapters.SeatRecycleAdapter
import com.example.figmapracticeapp.ui.adapters.TimeRecycleViewAdapter


class MovieScheduleFragment(
    val callback: () -> Unit
) : Fragment() {

    private lateinit var binding: FragmentMovieScheduleBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentMovieScheduleBinding.inflate(layoutInflater,container,false)

//        date recyclerview
        binding.RvDate.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)
        binding.RvDate.adapter = DateRecycleViewAdapter(this)

//        time recyclerview
        binding.rvTime.layoutManager = LinearLayoutManager(this.context,LinearLayoutManager.HORIZONTAL,false)
        binding.rvTime.adapter = TimeRecycleViewAdapter(this)

//        hall recyclerview
        binding.rvHall.layoutManager = LinearLayoutManager(this.context,LinearLayoutManager.HORIZONTAL,false)
        binding.rvHall.adapter = HallRecycleAdapter(this)

//        seat recyclerview
        binding.rvSeat.layoutManager = LinearLayoutManager(this.context,LinearLayoutManager.HORIZONTAL,false)
        binding.rvSeat.adapter = SeatRecycleAdapter(this)

        binding.selectSeatBtn.setOnClickListener {
            findNavController().navigate(R.id.movieTicketSeats)
        }

        return binding.root





    }





}