package com.example.triviaapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.triviaapp.databinding.ContinueActivityBinding
import com.example.triviaapp.databinding.EndGameActivityBinding
import com.example.triviaapp.model.Game

class ContinueActivity : AppCompatActivity() {

    lateinit var binding: ContinueActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ContinueActivityBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.accumulatedPoints.text = Game.actualGame?.totalPoint?.toString()

        binding.level.text = "Level Actual: ${(Game.actualGame?.currentLevel?.plus(1)).toString()}"

        binding.buttonContinue.setOnClickListener {
            startActivity(Intent(this, QuestionActivity::class.java))
        }

    }

}