package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val correctUsername = "admin"
        val correctPassword = "1234"

        binding.btnLogin.setOnClickListener {
            val username = binding.txtUser.text.toString()
            val password = binding.txtPassword.text.toString()

            if (username == correctUsername && password == correctPassword) {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("EXTRA_USERNAME", username)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Credenciales no válidas", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
