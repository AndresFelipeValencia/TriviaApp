package com.example.triviaapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.triviaapp.data.PlayerDataSource
import com.example.triviaapp.databinding.EndGameActivityBinding
import com.example.triviaapp.model.Game

class EndGameActivity : AppCompatActivity() {

    lateinit var binding: EndGameActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = EndGameActivityBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.accumulatedPoints.text = Game.actualGame?.totalPoint?.toString()

        binding.name.setOnClickListener {
        }

        binding.saveData.setOnClickListener {
            val namePlayer = binding.name.text.toString()
            PlayerDataSource.addNewPlayer(namePlayer, Game.actualGame!!.totalPoint)
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}