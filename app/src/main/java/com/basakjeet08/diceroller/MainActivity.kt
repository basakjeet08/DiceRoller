package com.basakjeet08.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun roll(){
        val diceRange = 1..6
        val randomNumber = diceRange.random()
        println("$randomNumber")

    }
}