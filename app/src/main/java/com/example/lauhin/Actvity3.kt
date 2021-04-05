package com.example.lauhin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Actvity3 : AppCompatActivity() {

    var score = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actvity3)
        val intent = this.intent

    }

    fun good(view: View)
    {

        val intent = Intent(this, Activity4::class.java)
        intent.putExtra("SCORE", score)
        startActivity(intent)

    }

    fun bad(view: View)
    {
        score++
        val intent = Intent(this, Activity4::class.java)
        intent.putExtra("SCORE", score)
        startActivity(intent)
    }
}