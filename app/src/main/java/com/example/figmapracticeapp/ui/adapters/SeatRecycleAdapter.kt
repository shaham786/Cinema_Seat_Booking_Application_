package com.example.figmapracticeapp.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.figmapracticeapp.R
import com.example.figmapracticeapp.ui.fragment.MovieScheduleFragment

class SeatRecycleAdapter(movieSearchActivity: MovieScheduleFragment
): RecyclerView.Adapter<SeatRecycleAdapter.Holder6>() {


    inner class Holder6(view: View) : RecyclerView.ViewHolder(view) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder6 {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.select_seat, parent, false)
        return Holder6(view)
    }

    override fun onBindViewHolder(holder: Holder6, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }

}
