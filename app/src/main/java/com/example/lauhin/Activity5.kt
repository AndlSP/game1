package com.example.lauhin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Activity5 : AppCompatActivity() {
    var score = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_5)
        val intent = this.intent
        score = intent.getIntExtra("SCORE", 0)

    }

    fun good(view: View)
    {

        val intent = Intent(this, Activity6::class.java)
        intent.putExtra("SCORE", score)
        startActivity(intent)

    }

    fun bad(view: View)
    {
        score++
        val intent = Intent(this, Activity6::class.java)
        intent.putExtra("SCORE", score)
        startActivity(intent)
    }
}