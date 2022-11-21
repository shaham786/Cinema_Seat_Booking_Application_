package com.example.figmapracticeapp.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.figmapracticeapp.ui.model.Fooddata
import com.example.figmapracticeapp.R
import com.example.figmapracticeapp.ui.activities.MovieSearchActivity

class RecycleViewAdapter(
    private val dataset: ArrayList<Fooddata>,
    movieSearchActivity: MovieSearchActivity
):
    RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>() {


    var onItemClick1 : ((Fooddata) -> Unit)? = null

    inner class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
       var itemimage :ImageView
       var itemtitle :TextView

      init {
          itemimage = view.findViewById(R.id.iv_cardview_layout)
          itemtitle = view.findViewById(R.id.tv_movie_title)

      }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_card_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.itemtitle.text = dataset[position].textView
        holder.itemimage.setImageResource(dataset[position].imageView)

        holder.itemView.setOnClickListener {
            onItemClick1?.invoke(dataset[position])
        }

    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}