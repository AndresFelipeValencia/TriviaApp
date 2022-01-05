package com.example.triviaapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.triviaapp.databinding.GameCompletedActivityBinding

class GameCompletedActivity : AppCompatActivity() {

    lateinit var binding: GameCompletedActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = GameCompletedActivityBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.saveData.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java ))
        }
    }
}