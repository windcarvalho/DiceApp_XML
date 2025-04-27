package com.example.diceapp2024_xml

import android.content.res.Resources
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var drawableRes= 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btRoll: Button = findViewById(R.id.btRoll)
        val diceImage: ImageView = findViewById(R.id.imageView)

        btRoll.setOnClickListener {

            val dice: Dice = Dice(6)
            val random = rollDice()
            drawableRes = when (random) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                6 -> R.drawable.dice_6
                else -> R.drawable.empty_dice
            }

            diceImage.setImageResource(drawableRes)

        }


    }

    private fun rollDice(): Int {
        var randomNum: Int = Random.nextInt(6) + 1
        return randomNum
    }


    override fun onResume() {
        super.onResume()
        Log.d("PDM25", "Onde estou?, $drawableRes ")
    }

    override fun onStart() {
        super.onStart()
        Log.d("PDM25", "Onde estou?, $drawableRes ")
    }

    override fun onPause() {
        super.onPause()
        Log.d("PDM25", "Onde estou?, $drawableRes ")
    }

    override fun onStop() {
        super.onStop()
        Log.d("PDM25", "Onde estou?, $drawableRes ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("PDM23", "No onResume")
    }
}
//