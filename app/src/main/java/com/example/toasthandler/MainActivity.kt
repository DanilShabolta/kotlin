package com.example.toasthandler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOk = findViewById<Button>(R.id.button_ok)

        buttonOk.setOnClickListener {
            Toast.makeText(this, "Кнопка ОК нажата", Toast.LENGTH_SHORT).show()
        }
    }
}