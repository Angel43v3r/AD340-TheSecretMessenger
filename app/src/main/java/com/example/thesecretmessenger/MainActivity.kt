package com.example.thesecretmessenger

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val secretMessage = findViewById<EditText>(R.id.message)
        val buttonSend = findViewById<Button>(R.id.button)

        // An OnClickListener for the button to grab the string in EditText
        buttonSend.setOnClickListener {
            // Capture: Grab the string from the EditText.
            val userInput = secretMessage.text.toString().trim()

            // Don't send empty message
            if (userInput.isEmpty()) {
                Toast.makeText(this, "Please enter a message!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Initialize: Create an Explicit Intent targeting MessageDisplayActivity
            val intent = Intent(this, MessageDisplayActivity::class.java)

            // Pack: Use .putExtra(key, value) to attach the string to the intent.
            intent.putExtra("DECODED_MESSAGE", userInput)

            // Launch: Call startActivity(intent).
            startActivity(intent)
        }
    }
}