package com.example.welcome_page

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.welcomepage.R
import com.google.android.material.textfield.TextInputEditText

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_activity)

        val usernameEditText = findViewById<TextInputEditText>(R.id.username)
        val emailEditText = findViewById<TextInputEditText>(R.id.email)
        val passwordEditText = findViewById<TextInputEditText>(R.id.password)
        val confirmPasswordEditText = findViewById<TextInputEditText>(R.id.confirm_password)
        val signupButton = findViewById<Button>(R.id.signup_button)

        signupButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            val confirmPassword = confirmPasswordEditText.text.toString()

            if (username.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty() && confirmPassword.isNotEmpty()) {
                if (password == confirmPassword) {
                    // Implement your sign-up logic here
                    Toast.makeText(this, "Sign-up successful!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Passwords do not match.", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Please fill out all fields.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
