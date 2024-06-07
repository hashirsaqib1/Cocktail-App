package com.example.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Alcoholic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alcoholic)
        val spritzButton: Button = findViewById(R.id.spritzbtn)
        spritzButton.setOnClickListener {
            val intent = Intent(this, Spritz::class.java)
            startActivity(intent)
        }

       val watermelonButton: Button = findViewById(R.id.watermelonbtn)
        watermelonButton.setOnClickListener {
            val intent = Intent(this, Watermelon::class.java)
            startActivity(intent)
        }

        val LemonadeButton: Button = findViewById(R.id.lemon)
        LemonadeButton.setOnClickListener {
            val intent = Intent(this, Lemonade::class.java)
            startActivity(intent)
        }

        val shirleyButton: Button = findViewById(R.id.Shirley)
        shirleyButton.setOnClickListener {
            val intent = Intent(this, Shirley::class.java)
            startActivity(intent)
        }

        val backButton: ImageButton = findViewById(R.id.back)
        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }


    }
}
