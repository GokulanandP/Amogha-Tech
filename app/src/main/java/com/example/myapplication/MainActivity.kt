package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var selected_user_type = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupListeners()
    }

    private fun setupListeners() {
        var rb1 = findViewById<RadioButton>(R.id.Fruit)
        var rb2 = findViewById<RadioButton>(R.id.Vegetable)
        var rb3 = findViewById<RadioButton>(R.id.Crops)

        Fruit.setOnClickListener {
            selected_user_type = 1
            rb2.isChecked = false
            rb3.isChecked = false

        }

        Vegetable.setOnClickListener {
            selected_user_type = 2
            rb1.isChecked = false
            rb3.isChecked = false

        }

        Crops.setOnClickListener {
            selected_user_type = 3
            rb1.isChecked = false
            rb2.isChecked = false

        }

        submit_type.setOnClickListener {
//            setupObservers(selected_user_type)
            if (selected_user_type == 0) {
                Toast.makeText(applicationContext, "Please select the user type", Toast.LENGTH_LONG)
                    .show()
            } else {
//                viewModel.usertype(selected_user_type,referral_mobile.text.trim().toString())
                val intent = Intent(this,Retailers_page::class.java)
                intent.putExtra("selected_type",selected_user_type)
                startActivity(intent)
            }
        }
    }
}