package com.example.figmapracticeapp.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.figmapracticeapp.R
import com.example.figmapracticeapp.ui.model.SeatingArangementModel

class SeatAdapter(private val dataset: ArrayList<SeatingArangementModel>
): RecyclerView.Adapter<SeatAdapter.Holder2>() {


    inner class Holder2(view : View) : RecyclerView.ViewHolder(view) {

        val itemimage : ImageView

        init {
            itemimage = view.findViewById(R.id.iv_seat_avaialble)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder2 {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.chair_layout,parent,false)
        return Holder2(view)
    }

    fun updateList(list: ArrayList<SeatingArangementModel>){
        this.dataset.clear()
        this.dataset.addAll(list)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: Holder2, position: Int) {

        if(dataset[position].isAvailable) {
            if(dataset[position].isSelected){
                holder.itemimage.setImageResource(R.drawable.seat_selected)
            } else {
                holder.itemimage.setImageResource(R.drawable.seat_available)
            }
            holder.itemView.setOnClickListener {
                val item = dataset[holder.adapterPosition]
                item.isSelected = !item.isSelected
                dataset[holder.adapterPosition] = item
                notifyItemChanged(holder.adapterPosition)
            }

        } else {
            holder.itemimage.setImageResource(R.color.white)
        }



    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}