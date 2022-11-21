package com.example.figmapracticeapp.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.figmapracticeapp.R
import com.example.figmapracticeapp.ui.fragment.MovieScheduleFragment

class HallRecycleAdapter(movieSearchActivity: MovieScheduleFragment
): RecyclerView.Adapter<HallRecycleAdapter.Holder5>() {


    inner class Holder5(view: View) : RecyclerView.ViewHolder(view) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder5 {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.select_hall, parent, false)
        return Holder5(view)
    }

    override fun onBindViewHolder(holder: Holder5, position: Int) {

    }

    override fun getItemCount(): Int {
        return 3
    }

}