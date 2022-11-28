package com.example.figmapracticeapp.ui.fragment

import android.app.AlertDialog
import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import com.example.figmapracticeapp.R
import com.example.figmapracticeapp.databinding.ChairLayoutBinding
import com.example.figmapracticeapp.databinding.FragmentMovieReviewBinding
import com.example.figmapracticeapp.databinding.FragmentMovieTicketSeatsBinding
import com.example.figmapracticeapp.ui.activities.MovieScreenActivity
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import java.nio.file.attribute.AclEntry.Builder


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




        binding.confirmTransactionBtn.setOnClickListener {
            val view = layoutInflater.inflate(R.layout.fingerprint_layout, null)
            val dialog = BottomSheetDialog(requireContext(),R.style.AppBottomSheetDialogTheme2)

            dialog.behavior.isDraggable = false
            dialog.setCancelable(true)
            dialog.setCanceledOnTouchOutside(false)
            dialog.setContentView(view)
            dialog.show()


/*            val view = layoutInflater.inflate(R.layout.select_cinema_bottomsheet, null)
            val dialog : AlertDialog.Builder = AlertDialog.Builder(requireContext(),R.style.AppBottomSheetDialogTheme)
            val alertDialog :AlertDialog = dialog.create()
            alertDialog.window?.setGravity(Gravity.BOTTOM)
            alertDialog.setView(view)
            alertDialog.show()*/
        }


        return binding.root
    }


}