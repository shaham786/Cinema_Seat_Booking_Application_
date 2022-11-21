package com.example.figmapracticeapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.figmapracticeapp.R
import com.example.figmapracticeapp.databinding.FragmentMovieTicketSeatsBinding
import com.example.figmapracticeapp.ui.adapters.SeatAdapter
import com.example.figmapracticeapp.ui.model.SeatingArangementModel

class MovieTicketSeats : Fragment() {

    private lateinit var binding : FragmentMovieTicketSeatsBinding
    private val arrayList = ArrayList<SeatingArangementModel>()
    val adapter = SeatAdapter(arrayList)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMovieTicketSeatsBinding.inflate(layoutInflater,container,false)

        arrayList.add(SeatingArangementModel(0, false))
        arrayList.add(SeatingArangementModel(1, true))
        arrayList.add(SeatingArangementModel(2, true))
        arrayList.add(SeatingArangementModel(3, true))
        arrayList.add(SeatingArangementModel(4, true))
        arrayList.add(SeatingArangementModel(5, false))
        arrayList.add(SeatingArangementModel(6, true))
        arrayList.add(SeatingArangementModel(7, true))
        arrayList.add(SeatingArangementModel(8, true))
        arrayList.add(SeatingArangementModel(9, true))
        arrayList.add(SeatingArangementModel(10, false))
        arrayList.add(SeatingArangementModel(11, true))
        arrayList.add(SeatingArangementModel(12, true))
        arrayList.add(SeatingArangementModel(14, true))
        arrayList.add(SeatingArangementModel(13, true))
        arrayList.add(SeatingArangementModel(15, true))
        arrayList.add(SeatingArangementModel(16, false))
        arrayList.add(SeatingArangementModel(17, true))
        arrayList.add(SeatingArangementModel(18, true,false))
        arrayList.add(SeatingArangementModel(19, true,false))
        arrayList.add(SeatingArangementModel(20, true,false))
        arrayList.add(SeatingArangementModel(21, true,false))
        arrayList.add(SeatingArangementModel(22, true,false))
        arrayList.add(SeatingArangementModel(23, true,false))
        arrayList.add(SeatingArangementModel(24, true,false))
        arrayList.add(SeatingArangementModel(25, true,false))
        arrayList.add(SeatingArangementModel(26, true,false))
        arrayList.add(SeatingArangementModel(27, false,false))
        arrayList.add(SeatingArangementModel(28, true,false))
        arrayList.add(SeatingArangementModel(29, true,false))
        arrayList.add(SeatingArangementModel(30, true,false))
        arrayList.add(SeatingArangementModel(31, true,false))
        arrayList.add(SeatingArangementModel(32, true,false))
        arrayList.add(SeatingArangementModel(33, true,false))
        arrayList.add(SeatingArangementModel(34, true,false))
        arrayList.add(SeatingArangementModel(35, true,false))
        arrayList.add(SeatingArangementModel(36, true,false))
        arrayList.add(SeatingArangementModel(37, true,false))
        arrayList.add(SeatingArangementModel(38, false,false))
        arrayList.add(SeatingArangementModel(39, true,false))
        arrayList.add(SeatingArangementModel(40, true,false))
        arrayList.add(SeatingArangementModel(41, true,false))
        arrayList.add(SeatingArangementModel(42, true,false))
        arrayList.add(SeatingArangementModel(43, true,false))
        arrayList.add(SeatingArangementModel(44, true,false))
        arrayList.add(SeatingArangementModel(45, true,false))
        arrayList.add(SeatingArangementModel(46, true,false))
        arrayList.add(SeatingArangementModel(47, true,false))
        arrayList.add(SeatingArangementModel(48, true,false))
        arrayList.add(SeatingArangementModel(49, false,false))
        arrayList.add(SeatingArangementModel(50, true,false))
        arrayList.add(SeatingArangementModel(51, true,false))
        arrayList.add(SeatingArangementModel(52, true,false))
        arrayList.add(SeatingArangementModel(53, true,false))
        arrayList.add(SeatingArangementModel(54, true,false))

        val availalelist :ArrayList<SeatingArangementModel> = arrayList.filter { it.isAvailable == true} as ArrayList<SeatingArangementModel>


        binding.rvMovieTicket.layoutManager = GridLayoutManager(this.context, 11)
        binding.rvMovieTicket.adapter = adapter


        binding.tv2Cl2.setOnClickListener {
            adapter.updateList(availalelist)
        }

       return binding.root
    }

}