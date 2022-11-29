package com.example.figmapracticeapp.ui.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.figmapracticeapp.R
import com.example.figmapracticeapp.databinding.ActivityMovieSearchBinding
import com.example.figmapracticeapp.ui.adapters.RecycleViewAdapter
import com.example.figmapracticeapp.ui.model.Fooddata

class MovieSearchActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMovieSearchBinding
    private val arrayList = ArrayList<Fooddata>()
    private var recyclerAdapter = RecycleViewAdapter(arrayList, this)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




        binding = ActivityMovieSearchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        arrayList.add(
            Fooddata("Tenet", R.drawable.tenet,"L3pk_TBkihU")
        )
        arrayList.add(
            Fooddata("Avengers EndGame", R.drawable.endgame,"TcMBFSGVi1c")
        )
        /*arrayList.add(
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
            Fooddata("Captain America CivilWar", R.drawable.civilwar)
        )
        arrayList.add(
            Fooddata("Captain America CivilWar", R.drawable.civilwar)
        )
*/


        /*val etsearch = binding.etSearchview
        etsearch.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(p0: Editable?) {
            }

        })
*/



        val layoutManager = GridLayoutManager(this, 2)
        binding.recyleView.layoutManager = layoutManager
        recyclerAdapter = RecycleViewAdapter(arrayList, this)
        binding.recyleView.adapter = recyclerAdapter
        recyclerAdapter.onItemClick1 = {
            val intent = Intent(this, MovieScreenActivity::class.java)
            intent.putExtra("food", it)
            startActivity(intent)
        }

        binding.ivCloseBtn.setOnClickListener {
            finish()
        }

    }
/*    private fun filter(text: String) {
        val filteredList: ArrayList<Fooddata> = ArrayList()
        for (item in dataset) {
            if (item.getText1().toLowerCase().contains(text.lowercase(Locale.getDefault()))) {
                filteredList.add(item)
            }
        }
        recyclerAdapter.filterList(filteredList)
    }*/

}