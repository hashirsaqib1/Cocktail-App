package com.example.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Alcoholicreal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_alcoholicreal)


        val MargButton: Button = findViewById(R.id.marg)
        MargButton.setOnClickListener {
            val intent = Intent(this, Margarita::class.java)
            startActivity(intent)
        }
        val MartiniButton: Button = findViewById(R.id.martini)
        MartiniButton.setOnClickListener {
            val intent = Intent(this, Martini::class.java)
            startActivity(intent)
        }

        val NigroniButton: Button = findViewById(R.id.nigroni)
        NigroniButton.setOnClickListener {
            val intent = Intent(this, Nigroni::class.java)
            startActivity(intent)
        }
        val WiskyButton: Button = findViewById(R.id.sour)
        WiskyButton.setOnClickListener {
            val intent = Intent(this, Whisky_sour::class.java)
            startActivity(intent)
        }

        val backButton: ImageButton = findViewById(R.id.back)
        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

    }
}
