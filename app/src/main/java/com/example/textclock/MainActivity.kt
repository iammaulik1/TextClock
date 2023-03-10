package com.example.textclock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextClock
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textClock = findViewById<TextClock>(R.id.textClock)
        val textView = findViewById<TextView>(R.id.textView)

        val button = findViewById<Button>(R.id.button)

        button?.setOnClickListener {
            textView?.text = "Time : " + textClock?.text
        }

    }
}