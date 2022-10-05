package com.basakjeet08.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val image: ImageView = findViewById(R.id.imageView)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val dice = Dice(6)
            val rolledNumber = dice.roll(image)
            if(dice.checkLuckyNumber(rolledNumber))
                Toast.makeText(this, "You Win!!", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this , "You Lose!!",Toast.LENGTH_SHORT).show()
        }
    }
}