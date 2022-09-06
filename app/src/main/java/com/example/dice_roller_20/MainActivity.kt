package com.example.dice_roller_20

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

lateinit var diceImage: ImageView //lateinit promises teh compiler that the vairable will be given a value later, and not left as null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton: Button = findViewById(R.id.roll_button)
        rollbutton.setOnClickListener{//Lmistens for events
            rolldice()
            //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show() //show causes the toast to...show
            //Toasts are small pop up messages
            //makeText has three parameters: context (telling the OS to display the toast), text (message), duration (how long to display message)
        }

    }

    private fun rolldice() {
        //val resultText: TextView = findViewById(R.id.button_value)
        val dieVal = Random.nextInt(6)+1
        //resultText.text = dieVal.toString()
        val what_image = when(dieVal){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        val diceImage: ImageView = findViewById(R.id.dice_image)
        diceImage.setImageResource(what_image)
    }
}