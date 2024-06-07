package com.example.app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonAlcoholic: Button = findViewById(R.id.alcoholic)
        buttonAlcoholic.setOnClickListener {
            val intent = Intent(this, Alcoholic::class.java)
            startActivity(intent)
        }



        val alcoholicrealButton: Button = findViewById(R.id.alcoholicreal)
        alcoholicrealButton.setOnClickListener {
            val intent = Intent(this, Alcoholicreal::class.java)
            startActivity(intent)
        }
    }
}
