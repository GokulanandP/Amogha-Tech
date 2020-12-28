package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Retailers_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retailers_page)

        recycler()


    }

    @SuppressLint("WrongConstant")
    private fun recycler()
    {
        val recyclerView = findViewById<RecyclerView>(R.id.retailer_recycler_view)
        //defining the layout for the recycler view
        recyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayout.VERTICAL, false)
        val adapter = RetailRecyclerView()
        recyclerView.adapter = adapter

    }
}