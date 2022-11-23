package com.example.figmapracticeapp.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.figmapracticeapp.R
import com.example.figmapracticeapp.ui.fragment.MovieScheduleFragment

class SearchCinemaAdapter(movieSearchActivity: MovieScheduleFragment
): RecyclerView.Adapter<SearchCinemaAdapter.Holder7>() {


    inner class Holder7(view: View) : RecyclerView.ViewHolder(view) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder7 {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.search_cinema_layout, parent, false)
        return Holder7(view)
    }

    override fun onBindViewHolder(holder: Holder7, position: Int) {

    }

    override fun getItemCount(): Int {
        return 50
    }

}