package com.example.ciphermaster

import android.content.Intent
import android.os.Bundle
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

public class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        shiftCipherButton.setOnClickListener {
            d("Bollhav", "Go to shift cipher")
            startActivity(Intent(this, ShiftCipherActivity::class.java))
        }

    }
}
