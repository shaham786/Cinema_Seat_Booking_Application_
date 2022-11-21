package com.example.figmapracticeapp.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.figmapracticeapp.R
import com.example.figmapracticeapp.ui.fragment.MovieScheduleFragment

class TimeRecycleViewAdapter(movieSearchActivity: MovieScheduleFragment
): RecyclerView.Adapter<TimeRecycleViewAdapter.Holder4>() {


    inner class Holder4(view: View) : RecyclerView.ViewHolder(view) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder4 {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.select_time, parent, false)
        return Holder4(view)
    }

    override fun onBindViewHolder(holder: Holder4, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }

}
