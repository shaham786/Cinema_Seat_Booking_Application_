package com.example.figmapracticeapp.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.figmapracticeapp.ui.model.Fooddata
import com.example.figmapracticeapp.R
import com.example.figmapracticeapp.ui.adapters.RecycleViewAdapter
import com.example.figmapracticeapp.databinding.MovieCardLayoutBinding

class MovieSearchActivity : AppCompatActivity() {

    private val arrayList = ArrayList<Fooddata>()
    private var recyclerAdapter = RecycleViewAdapter(arrayList, this)

    private lateinit var binding: MovieCardLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_search)


        arrayList.add(
            Fooddata("Avengers", R.drawable.avengers)
        )
        arrayList.add(
            Fooddata("Avengers EndGame", R.drawable.endgame)
        )
        arrayList.add(
            Fooddata("Captain America CivilWar", R.drawable.civilwar)
        )
        arrayList.add(
            Fooddata("Avengers", R.drawable.avengers)
        )
        arrayList.add(
            Fooddata("Avengers EndGame", R.drawable.endgame)
        )
        arrayList.add(
            Fooddata("Captain America CivilWar", R.drawable.civilwar)
        )
        arrayList.add(
            Fooddata("Avengers", R.drawable.avengers)
        )
        arrayList.add(
            Fooddata("Avengers EndGame", R.drawable.endgame)
        )
        arrayList.add(
            Fooddata("Captain America CivilWar Captain America CivilWar", R.drawable.civilwar)
        )
        arrayList.add(
            Fooddata("Captain America CivilWar", R.drawable.civilwar)
        )



        val recyclerView = findViewById<RecyclerView>(R.id.recyleView)
        val layoutManager = GridLayoutManager(this, 2)
        recyclerView.layoutManager = layoutManager
        recyclerAdapter = RecycleViewAdapter(arrayList, this)
        recyclerView.adapter = recyclerAdapter
        recyclerAdapter.onItemClick1 = {
            val intent = Intent(this, MovieScreenActivity::class.java)
            intent.putExtra("food", it)
            startActivity(intent)
        }

    }
}