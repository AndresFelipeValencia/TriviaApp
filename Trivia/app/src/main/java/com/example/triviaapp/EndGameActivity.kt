package com.example.triviaapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.triviaapp.data.listPlayer
import com.example.triviaapp.databinding.ActivityMainBinding
import com.example.triviaapp.databinding.EndGameActivityBinding
import com.example.triviaapp.model.Player

class EndGameActivity : AppCompatActivity() {
    private val instanceOfData = listPlayer

    lateinit var binding: EndGameActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = EndGameActivityBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.name.setOnClickListener {
        }

        binding.saveData.setOnClickListener {
            val namePlayer = binding.name.text.toString()
            val player = Player(namePlayer, points = 0)
            instanceOfData.add(player)
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}