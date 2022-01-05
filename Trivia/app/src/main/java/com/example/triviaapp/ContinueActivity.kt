package com.example.triviaapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.triviaapp.databinding.ContinueActivityBinding
import com.example.triviaapp.databinding.EndGameActivityBinding

class ContinueActivity : AppCompatActivity() {

    lateinit var binding: ContinueActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ContinueActivityBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.buttonContinue.setOnClickListener {
            startActivity(Intent(this, QuestionActivity::class.java))
        }

    }

}