package com.example.attributes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var buttonBlackText: Button
    private lateinit var buttonRedText: Button
    private lateinit var buttonSize85: Button
    private lateinit var buttonSize245: Button
    private lateinit var buttonBackgroundWhite: Button
    private lateinit var buttonBackgroundYellow: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        buttonBlackText.setOnClickListener {
            editText.setTextColor(Color.BLACK)
        }

        buttonRedText.setOnClickListener {
            editText.setTextColor(Color.RED)
        }

        buttonBackgroundYellow.setOnClickListener {
            editText.setBackgroundColor(Color.YELLOW)
        }

        buttonBackgroundWhite.setOnClickListener {
            editText.setBackgroundColor(Color.WHITE)
        }

        buttonSize85.setOnClickListener {
            editText.textSize = 85f
        }

        buttonSize245.setOnClickListener {
            editText.textSize = 245f
        }

    }
}