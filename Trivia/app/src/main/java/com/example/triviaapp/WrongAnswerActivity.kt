package com.example.triviaapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.triviaapp.databinding.WrongAnswerActivityBinding

class WrongAnswerActivity : AppCompatActivity() {

    lateinit var binding: WrongAnswerActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = WrongAnswerActivityBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.endGame.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}