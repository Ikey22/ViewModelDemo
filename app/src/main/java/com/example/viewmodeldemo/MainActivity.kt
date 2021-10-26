package com.example.viewmodeldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val display : TextView = findViewById(R.id.display)
        val submit : Button = findViewById(R.id.submit)

        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        display.text = viewModel.number.toString()

        submit.setOnClickListener {
            viewModel.addNumber()
            display.text = viewModel.number.toString()
        }
    }
}