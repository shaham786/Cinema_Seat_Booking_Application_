package com.example.figmapracticeapp.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.figmapracticeapp.R
import com.example.figmapracticeapp.ui.fragment.MovieScheduleFragment

class DateRecycleViewAdapter(
    movieSearchActivity: MovieScheduleFragment
): RecyclerView.Adapter<DateRecycleViewAdapter.Holder3>() {
    private var selectedPosition = -1


    inner class Holder3(view : View) : RecyclerView.ViewHolder(view) {


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder3 {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.date,parent,false)
        return Holder3(view)
    }

    override fun onBindViewHolder(holder: Holder3, position: Int) {
        holder.itemView.isSelected = selectedPosition == position
        holder.itemView.setOnClickListener {

            if (selectedPosition >= 0) notifyItemChanged(selectedPosition)
            selectedPosition = holder.adapterPosition
            notifyItemChanged(selectedPosition)

        }
    }

    override fun getItemCount(): Int {
        return 10
    }

}
