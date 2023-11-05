package com.minphone.assignment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.minphone.assignment3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
      override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            val binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.tvForgotPassword.setOnClickListener {
                  Toast.makeText(this, "Forgot Password Clicked", Toast.LENGTH_SHORT).show()
            }

            binding.btnSignIn.setOnClickListener {
                  if (binding.etEmail.text.toString().isEmpty()) {
                        binding.etEmail.error = "Email is required"
                  }

                  if (binding.etPassword.text.toString().isEmpty()) {
                        binding.etPassword.error = "Password is required"
                  }

                  Toast.makeText(
                        this,
                        "Sign In: email: ${binding.etEmail.text} password: ${binding.etPassword.text}",
                        Toast.LENGTH_SHORT
                  ).show()
            }

            binding.btnCreateAccount.setOnClickListener {
                  Toast.makeText(this, "Create Account Clicked", Toast.LENGTH_SHORT).show()
            }
      }
}