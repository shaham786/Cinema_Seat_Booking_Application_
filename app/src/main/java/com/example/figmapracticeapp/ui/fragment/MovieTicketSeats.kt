package com.example.figmapracticeapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.figmapracticeapp.R
import com.example.figmapracticeapp.databinding.FragmentMovieTicketSeatsBinding
import com.example.figmapracticeapp.ui.activities.MovieScreenActivity
import com.example.figmapracticeapp.ui.adapters.SeatAdapter
import com.example.figmapracticeapp.ui.model.SeatingArangementModel
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MovieTicketSeats : Fragment() {

    private lateinit var binding : FragmentMovieTicketSeatsBinding
    private lateinit var arrayList: ArrayList<SeatingArangementModel>
    private var flag:Boolean=false
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentMovieTicketSeatsBinding.inflate(layoutInflater,container,false)



        (activity as MovieScreenActivity).getDotIndicator().apply {
            initDots(4)
            setDotSelection(1)
        }




        if(!flag){
            arrayList = ArrayList()
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
        arrayList.add(SeatingArangementModel(18, true))
        arrayList.add(SeatingArangementModel(19, true))
        arrayList.add(SeatingArangementModel(20, true))
        arrayList.add(SeatingArangementModel(21, true))
        arrayList.add(SeatingArangementModel(22, true))
        arrayList.add(SeatingArangementModel(23, true))
        arrayList.add(SeatingArangementModel(24, true))
        arrayList.add(SeatingArangementModel(25, true))
        arrayList.add(SeatingArangementModel(26, true))
        arrayList.add(SeatingArangementModel(27, false))
        arrayList.add(SeatingArangementModel(28, true))
        arrayList.add(SeatingArangementModel(29, true))
        arrayList.add(SeatingArangementModel(30, true))
        arrayList.add(SeatingArangementModel(31, true))
        arrayList.add(SeatingArangementModel(32, true))
        arrayList.add(SeatingArangementModel(33, true))
        arrayList.add(SeatingArangementModel(34, true))
        arrayList.add(SeatingArangementModel(35, true))
        arrayList.add(SeatingArangementModel(36, true))
        arrayList.add(SeatingArangementModel(37, true))
        arrayList.add(SeatingArangementModel(38, false))
        arrayList.add(SeatingArangementModel(39, true))
        arrayList.add(SeatingArangementModel(40, true))
        arrayList.add(SeatingArangementModel(41, true))
        arrayList.add(SeatingArangementModel(42, true))
        arrayList.add(SeatingArangementModel(43, true))
        arrayList.add(SeatingArangementModel(44, true))
        arrayList.add(SeatingArangementModel(45, true))
        arrayList.add(SeatingArangementModel(46, true))
        arrayList.add(SeatingArangementModel(47, true))
        arrayList.add(SeatingArangementModel(48, true))
        arrayList.add(SeatingArangementModel(49, false))
        arrayList.add(SeatingArangementModel(50, true))
        arrayList.add(SeatingArangementModel(51, true))
        arrayList.add(SeatingArangementModel(52, true))
        arrayList.add(SeatingArangementModel(53, true))
        arrayList.add(SeatingArangementModel(54, true))
        arrayList.add(SeatingArangementModel(55, true))
        arrayList.add(SeatingArangementModel(56, true))
        arrayList.add(SeatingArangementModel(57, true))
        arrayList.add(SeatingArangementModel(58, true))
        arrayList.add(SeatingArangementModel(59, true))
        arrayList.add(SeatingArangementModel(60, false))
        arrayList.add(SeatingArangementModel(61, true))
        arrayList.add(SeatingArangementModel(62, true))
        arrayList.add(SeatingArangementModel(63, true))
        arrayList.add(SeatingArangementModel(64, true))
        arrayList.add(SeatingArangementModel(65, true))
        arrayList.add(SeatingArangementModel(66, true))
        arrayList.add(SeatingArangementModel(67, true))
        arrayList.add(SeatingArangementModel(68, true))
        arrayList.add(SeatingArangementModel(69, true))
        arrayList.add(SeatingArangementModel(70, true))
        arrayList.add(SeatingArangementModel(71, false))
        arrayList.add(SeatingArangementModel(72, true))
        arrayList.add(SeatingArangementModel(73, true))
        arrayList.add(SeatingArangementModel(74, true))
        arrayList.add(SeatingArangementModel(75, true))
        arrayList.add(SeatingArangementModel(76, true))
        arrayList.add(SeatingArangementModel(77, true))
        arrayList.add(SeatingArangementModel(78, true))
        arrayList.add(SeatingArangementModel(79, true))
        arrayList.add(SeatingArangementModel(80, true))
        arrayList.add(SeatingArangementModel(81, true))
        arrayList.add(SeatingArangementModel(82, false))
        arrayList.add(SeatingArangementModel(83, true))
        arrayList.add(SeatingArangementModel(84, true))
        arrayList.add(SeatingArangementModel(85, true))
        arrayList.add(SeatingArangementModel(86, true))
        arrayList.add(SeatingArangementModel(87, true))
        flag=true
        }

//        val availalelist :ArrayList<SeatingArangementModel> = arrayList.filter { it.isAvailable }
//        as ArrayList<SeatingArangementModel>

        binding.rvMovieTicket.layoutManager = GridLayoutManager(this.context, 11)
        binding.rvMovieTicket.setHasFixedSize(true)

        val adapter = SeatAdapter(arrayList)
        binding.rvMovieTicket.adapter = adapter


        val bottomSheetBehavior : BottomSheetBehavior<*>?

        val bottomsheet : View = binding.includeBottomsheet.root
        bottomSheetBehavior = BottomSheetBehavior.from(bottomsheet)

        bottomSheetBehavior.state = BottomSheetBehavior.STATE_HIDDEN
        adapter.onItemClick ={


            bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
        }

//        binding.tv2Cl2.setOnClickListener {
//            adapter.updateList(availalelist)
//        }

        binding.includeBottomsheet.bookNowBtn.setOnClickListener {
            findNavController().navigate(R.id.action_movieTicketSeats_to_movieReviewFragment)
        }
        return binding.root
    }

}