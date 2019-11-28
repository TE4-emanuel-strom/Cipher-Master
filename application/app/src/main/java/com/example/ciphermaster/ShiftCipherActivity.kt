package com.example.ciphermaster

import android.os.Bundle
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity

import ciphers.ShiftCipher
import kotlinx.android.synthetic.main.activity_shift_cipher.*


class ShiftCipherActivity : AppCompatActivity(){



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shift_cipher)

        encodeButton.setOnClickListener {
            d("Bollhav", "This is your inputed message: ${messageInput.text}")
            val answer = ShiftCipher(messageInput.text.toString(), -1).encode()
            answerText.text = answer

        }

    }


}