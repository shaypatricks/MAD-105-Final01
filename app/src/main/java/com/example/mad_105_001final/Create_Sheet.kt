package com.example.mad_105_001final

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Context

class Create_Sheet : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create__sheet)

    }



}


enum class Skills{
    Strength,
    Dexterity,
    Constitution,
    Intelligence,
    Wisdom,
    Charisma
}


enum class Class{
    Fighter,
    Rogue,
    Wizard,

}