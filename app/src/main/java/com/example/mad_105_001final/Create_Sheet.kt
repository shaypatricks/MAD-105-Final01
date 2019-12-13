package com.example.mad_105_001final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import kotlin.random.Random
import kotlin.random.nextInt

class Create_Sheet : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create__sheet)

        val STR_Button = findViewById(R.id.image_Roll_STR) as ImageButton
        var StrengthText = findViewById(R.id.StrengthText) as EditText


        STR_Button.setOnClickListener {

            StrengthText.setText( Random.nextInt(1..20).toString())
        }

        val DEX_Button = findViewById(R.id.image_Roll_DEX) as ImageButton
        var DexterityText = findViewById(R.id.DexterityText) as EditText


        DEX_Button.setOnClickListener {

            DexterityText.setText( Random.nextInt(1..20).toString())
        }

        val CHA_Button = findViewById(R.id.image_Roll_CHA) as ImageButton
        var CharismaText = findViewById(R.id.CharismaText) as EditText


       CHA_Button.setOnClickListener {

            CharismaText.setText( Random.nextInt(1..20).toString())
        }

        val INT_Button = findViewById(R.id.image_Roll_INT) as ImageButton
        var IntelligenceText = findViewById(R.id.IntelligenceText) as EditText


        INT_Button.setOnClickListener {

            IntelligenceText.setText( Random.nextInt(1..20).toString())
        }

        val WIS_Button = findViewById(R.id.image_Roll_WIS) as ImageButton
        var WisdomText = findViewById(R.id.WisdomText) as EditText


        WIS_Button.setOnClickListener {

            WisdomText.setText( Random.nextInt(1..20).toString())
        }
        val CON_Button = findViewById(R.id.image_Roll_CON) as ImageButton
        var ConstitutionText = findViewById(R.id.ConstitutionText) as EditText


        CON_Button.setOnClickListener {

           ConstitutionText.setText( Random.nextInt(1..20).toString())
        }

        val Next_Button = findViewById(R.id.Next_Button) as Button

        Next_Button.setOnClickListener {
            val intent = Intent(this, CharacterDisplay::class.java)
            startActivity(intent)
        }


    }



}


