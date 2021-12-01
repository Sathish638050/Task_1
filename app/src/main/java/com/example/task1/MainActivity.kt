package com.example.task1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val color1 = findViewById<TextView>(R.id.text1)
        val color2 = findViewById<TextView>(R.id.text2)
        val color3 = findViewById<TextView>(R.id.text3)
        val result = findViewById<TextView>(R.id.result)

        color1.setOnClickListener {
            result.text = "You Click Blue Color"
            result.setTextColor(Color.parseColor("#0751E6"))
        }

        color2.setOnClickListener {
            result.text = "You Click Green Color"
            result.setTextColor(Color.parseColor("#257303"))
        }

        color3.setOnClickListener {
            result.text = "You Click Orange Color"
            result.setTextColor(Color.parseColor("#ED3F09   "))
        }

    }

}