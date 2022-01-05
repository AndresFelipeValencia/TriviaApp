package com.example.triviaapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.triviaapp.databinding.ConsultRegisterActivityBinding

class ConsultRegisterActivity : AppCompatActivity() {

    lateinit var binding: ConsultRegisterActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ConsultRegisterActivityBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.buttonReturn.setOnClickListener {
            onBackPressed()
        }
    }
}