package com.example.ciphermaster

import android.content.Intent
import android.os.Bundle
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_about_me.*

class AboutMe : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)

        slightlySmallerButton.setOnClickListener {
            d("Bollhav", "This button works too!!!")
            startActivity(Intent(this, MainActivity::class.java))
        }
    }


}