package com.example.triviaapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.triviaapp.data.PlayerDataSource
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
            val namePlayer = binding.name.text.toString()
            PlayerDataSource.addNewPlayer(namePlayer, point = 1)
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}