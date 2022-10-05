package com.basakjeet08.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        val output : TextView = findViewById(R.id.textView)
        button.setOnClickListener {
            val dice = Dice(6)
            val randomNumber = dice.roll()
            output.text = randomNumber.toString()
        }
    }
}