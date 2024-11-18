package com.example.diceapp2024_xml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btRoll: Button = findViewById(R.id.btRoll)
        val diceImage:ImageView = findViewById(R.id.imageView)

        btRoll.setOnClickListener {

            val d:Dice = Dice (6)
            val random= 2 //rollDice()
            val drawableRes = when (random){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                else -> R.drawable.empty_dice
            }

            diceImage.setImageResource(drawableRes)

        }

    }

    private fun rollDice():Int {
        var randomNum:Int = Random.nextInt()+ 1
        return randomNum
    }
}