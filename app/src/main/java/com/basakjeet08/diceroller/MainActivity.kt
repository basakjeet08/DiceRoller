package com.basakjeet08.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val image: ImageView = findViewById(R.id.imageView)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val dice = Dice(6)
            val randomNumber = dice.roll()
            image.setImageResource(randomNumber)
        }
    }
}