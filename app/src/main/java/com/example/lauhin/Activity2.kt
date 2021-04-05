package com.example.lauhin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent

class Activity2 : AppCompatActivity() {
    var score = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val intent = this.intent
        score = intent.getIntExtra("SCORE", 0)

    }

    fun good(view: View)
    {
        score++
        val intent = Intent(this, Actvity3::class.java)
        intent.putExtra("SCORE", score)
        startActivity(intent)

    }

    fun bad(view: View)
    {
        val intent = Intent(this, Actvity3::class.java)
        intent.putExtra("SCORE", score)
        startActivity(intent)
    }
}