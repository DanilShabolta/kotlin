package com.example.logging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var buttonLog: Button
    private lateinit var buttonTimber: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        buttonLog = findViewById(R.id.button_log)
        buttonTimber = findViewById(R.id.button_timber)

        buttonLog.setOnClickListener {
            val text = editText.text.toString()
            Log.v("FromEditText", text)
        }

        // Инициализация Timber
        Timber.plant(Timber.DebugTree())

        buttonTimber.setOnClickListener {
            val text = editText.text.toString()
            Timber.v(text)
        }
    }
}