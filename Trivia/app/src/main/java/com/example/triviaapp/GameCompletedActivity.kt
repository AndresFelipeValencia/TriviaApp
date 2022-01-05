package com.example.triviaapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.triviaapp.data.listPlayer
import com.example.triviaapp.databinding.GameCompletedActivityBinding
import com.example.triviaapp.model.Player

class GameCompletedActivity : AppCompatActivity() {
    private val instanceOfData = listPlayer

    lateinit var binding: GameCompletedActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = GameCompletedActivityBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.saveData.setOnClickListener {
            val namePlayer = binding.name.text.toString()
            val player = Player(namePlayer, points = 1)
            instanceOfData.add(player)
            startActivity(Intent(this, MainActivity::class.java ))
        }
    }
}