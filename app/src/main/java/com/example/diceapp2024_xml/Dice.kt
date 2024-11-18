package com.example.diceapp2024_xml

import android.util.Log

data class Dice (val numFaces:Int){
    var number:Int = 1
        set(value) {
            if ((value <=numFaces)&&(value >=1)){
                field=value
            }else
            {
                Log.v("pdm","Tentaram alterar um valor fora do range")
            }
        }


}