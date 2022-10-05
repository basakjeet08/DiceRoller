package com.basakjeet08.diceroller

import android.widget.ImageView

class Dice(sides:Int) {
    private val dice1 : Int = R.drawable.dice_1
    private val dice2 : Int = R.drawable.dice_2
    private val dice3 : Int = R.drawable.dice_3
    private val dice4 : Int = R.drawable.dice_4
    private val dice5 : Int = R.drawable.dice_5
    private val dice6 : Int = R.drawable.dice_6
    private val diceRange = 1..sides
    fun roll(image:ImageView) : Int{
        val number = diceRange.random()
        when(number){
            1 -> image.setImageResource(dice1)
            2 -> image.setImageResource(dice2)
            3 -> image.setImageResource(dice3)
            4 -> image.setImageResource(dice4)
            5 -> image.setImageResource(dice5)
            6 -> image.setImageResource(dice6)
        }
        return number
    }
    fun checkLuckyNumber(rolledNumber : Int) : Boolean{
        val luckyNumber = diceRange.random()
        return (luckyNumber == rolledNumber)
    }
}