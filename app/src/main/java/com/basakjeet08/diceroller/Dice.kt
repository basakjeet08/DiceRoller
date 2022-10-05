package com.basakjeet08.diceroller

import android.widget.ImageView

class Dice(sides:Int) {

    //All the Dice image resources are saved in a variable
    private val dice1 : Int = R.drawable.dice_1
    private val dice2 : Int = R.drawable.dice_2
    private val dice3 : Int = R.drawable.dice_3
    private val dice4 : Int = R.drawable.dice_4
    private val dice5 : Int = R.drawable.dice_5
    private val dice6 : Int = R.drawable.dice_6
    private val diceRange = 1..sides

    //This function Sets the Image according to the Random Rolled Number and returns the Random Number
    fun roll(image:ImageView) : Int{
        val number = diceRange.random()

        // image is Set According to the Random Number
        image.setImageResource(when(number){
            1 -> dice1
            2 -> dice2
            3 -> dice3
            4 -> dice4
            5 -> dice5
            else -> dice6
        })
        return number
    }

    //This Function checks if the Rolled Random Number is equal to the Lucky Number and sends the Boolean Value
    fun checkLuckyNumber(rolledNumber : Int) : Boolean{ return (diceRange.random() == rolledNumber) }
}