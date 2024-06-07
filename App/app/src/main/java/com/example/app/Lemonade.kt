package com.example.app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Lemonade : AppCompatActivity() {
    lateinit var imageButton: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lemonade)

        imageButton = findViewById(R.id.youtubelink)
        imageButton.setOnClickListener {
            openUrl("https://www.youtube.com/watch?v=nEPVuJ1YH7Q&pp=ygUbaG93IHRvIG1ha2UgbGVtZW5hZGUgc3ByaXR6")
        }

        val backButton: ImageButton = findViewById(R.id.back)
        backButton.setOnClickListener {
            val intent = Intent(this, Alcoholic::class.java)
            startActivity(intent)

        }
    }

    private fun openUrl(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}




