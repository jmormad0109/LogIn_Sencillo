package com.example.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtener el nombre de usuario desde el Intent
        val username = intent.getStringExtra("EXTRA_USERNAME") ?: "Usuario"

        // Asignar el ID manualmente
        val userId = 1

        // Configurar el texto en el TextView con el formato solicitado
        binding.usernameTextView.text = "Usuario: $username\nId Usuario: $userId"
    }
}
