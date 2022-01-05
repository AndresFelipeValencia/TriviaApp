package com.example.triviaapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.triviaapp.databinding.ActivityMainBinding
import com.example.triviaapp.databinding.QuestionActivityBinding

class QuestionActivity : AppCompatActivity() {

    lateinit var binding: QuestionActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = QuestionActivityBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.endGame.setOnClickListener {
            startActivity(Intent(this, EndGameActivity::class.java))
        }

        binding.buttonContinue.setOnClickListener {
        }

    }
}