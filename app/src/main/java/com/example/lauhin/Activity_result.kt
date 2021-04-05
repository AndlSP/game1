package com.example.lauhin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity_result : AppCompatActivity() {
    var score = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val intent = this.intent
        score = intent.getIntExtra("SCORE", 0)
        val tview = findViewById<TextView>(R.id.textView)
        tview.text = "Ваш результат: " +score.toString()
    }
}