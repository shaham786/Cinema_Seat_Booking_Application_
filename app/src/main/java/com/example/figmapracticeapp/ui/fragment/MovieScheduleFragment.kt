package com.example.figmapracticeapp.ui.fragment

import android.os.Bundle
import android.os.ProxyFileDescriptorCallback
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.figmapracticeapp.R
import com.example.figmapracticeapp.databinding.FragmentMovieScheduleBinding
import com.example.figmapracticeapp.ui.adapters.*
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog


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


        binding.tvSelectCinema.setOnClickListener {


            val dialog = BottomSheetDialog(requireContext(),R.style.AppBottomSheetDialogTheme)
            val view = layoutInflater.inflate(R.layout.select_cinema_bottomsheet, null)



            val rv_search_cinema = view.rootView.findViewById<RecyclerView>(R.id.rv_select_cinema_1)
            rv_search_cinema.layoutManager = LinearLayoutManager(this.context,LinearLayoutManager.VERTICAL,false)
            rv_search_cinema.adapter = SearchCinemaAdapter(this)




            dialog.behavior.peekHeight = 1000
            dialog.setCancelable(true)
            dialog.setCanceledOnTouchOutside(true)
            dialog.setContentView(view)
            dialog.show()

        }
        binding.selectSeatBtn.setOnClickListener {
            findNavController().navigate(R.id.movieTicketSeats)
        }



        return binding.root





    }





}