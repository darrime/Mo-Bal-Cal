package com.github.darrime.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val displayView = findViewById<TextView>(R.id.textView)
        val add_event = findViewById<Button>(R.id.plus)
        var number = 0

        add_event.setOnClickListener {
            number++
            displayView.text = number.toString()

        }


    }
}