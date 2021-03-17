package com.cooking.merge

import android.graphics.Color
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_search.*

class SearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_search)

        val searchView = findViewById<android.widget.SearchView>(R.id.search)

        val searchIcon = search.findViewById<ImageView>(R.id.search_mag_icon)
        searchIcon.setColorFilter(Color.WHITE)

        val cancelIcon = search.findViewById<ImageView>(R.id.search_close_btn)
        cancelIcon.setColorFilter(Color.WHITE)

        val textView = search.findViewById<TextView>(R.id.search_src_text)
        textView.setTextColor(Color.WHITE)

        val searchList = findViewById<ListView>(R.id.search_list)

        val searchItems = arrayOf(
            "高麗菜","蛋","水果","燕麥","優格","洋蔥","肉","吐司","湯"
        )

        val adapter : ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1,searchItems
        )

        searchList.adapter = adapter

        searchView.setOnQueryTextListener(object : android.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                adapter.filter.filter(newText)
                return false
            }

        })
    }
}