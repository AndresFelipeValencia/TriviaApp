package com.example.triviaapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.triviaapp.databinding.ActivityMainBinding
import com.example.triviaapp.databinding.QuestionActivityBinding
import com.example.triviaapp.model.Game

class QuestionActivity : AppCompatActivity() {

    lateinit var binding: QuestionActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = QuestionActivityBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val question = Game.actualGame?.getNextQuestion()

        binding.levelTitle.text = "Level: ${question?.level.toString()} Category ${question?.category?.name}"

        binding.questionOne.text = question?.question

        question?.getQuestionsOption()?.forEachIndexed { index, option ->
            when (index) {
                0 -> binding.optionOne.text = option.option
                1 -> binding.optionTwo.text = option.option
                2 -> binding.optionThree.text = option.option
                3 -> binding.optionFour.text = option.option
            }
        }

        binding.endGame.setOnClickListener {
            startActivity(Intent(this, EndGameActivity::class.java))
        }

        binding.buttonContinue.setOnClickListener {
        }

    }
}