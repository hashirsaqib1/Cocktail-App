package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val email = findViewById<EditText>(R.id.EmailAddress)
        val password = findViewById<EditText>(R.id.Password)
        val login = findViewById<Button>(R.id.button3)

        login.setOnClickListener {
            val email = email.text.toString()
            val password = password.text.toString()

            // You can add your email and password validation logic here

            if (email.isNotEmpty() && password.isNotEmpty()) {
                // Display a toast message
                Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show()

                // Start the main activity
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)

                // Close this activity
                finish()
            } else {
                // Display an error toast message if email or password is empty
                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

