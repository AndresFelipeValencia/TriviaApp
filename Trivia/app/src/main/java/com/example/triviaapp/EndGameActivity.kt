package com.example.triviaapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.triviaapp.databinding.ActivityMainBinding
import com.example.triviaapp.databinding.EndGameActivityBinding

class EndGameActivity : AppCompatActivity() {

    lateinit var binding: EndGameActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = EndGameActivityBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.name.setOnClickListener {
        }

        binding.saveData.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}