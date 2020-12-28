package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.text.SimpleDateFormat


class RetailRecyclerView () : RecyclerView.Adapter<RetailRecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.activity_retail_recycler_view, parent, false )
        return ViewHolder(v)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        //initialize the views
        val nameData = itemView.findViewById<TextView>(R.id.Name)
        val distanceData = itemView.findViewById<TextView>(R.id.distance)
        val contactData = itemView.findViewById<TextView>(R.id.Contact)
        val addressData = itemView.findViewById<TextView>(R.id.address)
    }

    override fun getItemCount(): Int {
        return 1
    }

    val a ="Distance = 1 kms"
    val b = "Ravi"
    val c ="Contact number : 00000000000"
    val d = "Address: xxxxx,yyyyy,zzzzz"

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.distanceData.text = a
        holder.nameData.text = b
        holder.contactData.text = c
        holder.addressData.text = d
    }
}