package com.example.app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.net.URL

class Whisky_sour : AppCompatActivity() {
    lateinit var ytbutton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_whisky_sour)

        ytbutton = findViewById(R.id.youtube)
        ytbutton.setOnClickListener {
            openUrl("https://www.youtube.com/watch?v=mST_o5gJISs&pp=ygULV2hpc2t5IHNvdXI%3D")
        }


        val backButton: ImageButton = findViewById(R.id.back)
        backButton.setOnClickListener {
            val intent = Intent(this, Alcoholicreal::class.java)
            startActivity(intent)
        }

    }

    private fun openUrl(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }



}
