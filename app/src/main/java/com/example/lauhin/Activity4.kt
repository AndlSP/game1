package com.example.lauhin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Activity4 : AppCompatActivity() {
    var score = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)
        val intent = this.intent
        score = intent.getIntExtra("SCORE", 0)
    }

    fun good(view: View)
    {
        score++
        val intent = Intent(this, Activity5::class.java)
        intent.putExtra("SCORE", score)
        startActivity(intent)

    }

    fun bad(view: View)
    {
        val intent = Intent(this, Activity5::class.java)
        intent.putExtra("SCORE", score)
        startActivity(intent)
    }
}