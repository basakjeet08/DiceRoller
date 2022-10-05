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

        // Creating the Button ImageView and the Dice Class Instances for Later Use
        val image: ImageView = findViewById(R.id.imageView)
        val button: Button = findViewById(R.id.button)
        val dice = Dice(6)

        // Sets an Random Rolled Dice Image
        dice.roll(image)

        //When the Button Roll is Pressed this Section Works
        button.setOnClickListener {
            val rolledNumber = dice.roll(image)
            if(dice.checkLuckyNumber(rolledNumber))
                Toast.makeText(this, "You Win!!", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this , "You Lose!!",Toast.LENGTH_SHORT).show()
        }
    }
}