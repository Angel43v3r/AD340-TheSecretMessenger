package com.example.thesecretmessenger

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MessageDisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_message_display)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // text retrieved
        val decodedSecretMessage = findViewById<TextView>(R.id.decodedMessage)
        // Back Button
        val backBtn = findViewById<Button>(R.id.backButton)

        // Retrieve: Use intent.getStringExtra(key) (Kotlin) inside onCreate.
        val messageDecoded = intent.getStringExtra("DECODED_MESSAGE")
        // Display: Set the text of your TextView to this retrieved value.
        decodedSecretMessage.text = messageDecoded ?: "No message received!"

        backBtn.setOnClickListener {
            finish()
        }
    }
}