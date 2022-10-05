package com.basakjeet08.diceroller

class Dice(private val sides:Int) {
    private val dice1 : Int = R.drawable.dice_1
    private val dice2 : Int = R.drawable.dice_2
    private val dice3 : Int = R.drawable.dice_3
    private val dice4 : Int = R.drawable.dice_4
    private val dice5 : Int = R.drawable.dice_5
    private val dice6 : Int = R.drawable.dice_6
    fun roll() : Int{
        var showImage : Int = 0
        val diceRange = 1..sides
        when(diceRange.random()){
            1 -> showImage = dice1
            2 -> showImage = dice2
            3 -> showImage = dice3
            4 -> showImage = dice4
            5 -> showImage = dice5
            6 -> showImage = dice6
        }
        return showImage
    }
}