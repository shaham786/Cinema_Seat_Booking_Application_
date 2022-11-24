package com.example.figmapracticeapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.figmapracticeapp.R
import com.example.figmapracticeapp.databinding.ChairLayoutBinding
import com.example.figmapracticeapp.databinding.FragmentMovieReviewBinding
import com.example.figmapracticeapp.databinding.FragmentMovieTicketSeatsBinding
import com.example.figmapracticeapp.ui.activities.MovieScreenActivity


class MovieReviewFragment : Fragment() {

    private lateinit var binding: FragmentMovieReviewBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMovieReviewBinding.inflate(layoutInflater,container,false)


        (activity as MovieScreenActivity).getDotIndicator().apply {
            initDots(4)
            setDotSelection(2)
        }

        return binding.root
    }


}