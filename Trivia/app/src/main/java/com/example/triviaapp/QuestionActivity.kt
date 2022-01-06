package com.example.triviaapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.triviaapp.databinding.QuestionActivityBinding
import com.example.triviaapp.model.Game
import com.example.triviaapp.model.GameState

class QuestionActivity : AppCompatActivity() {

    lateinit var binding: QuestionActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = QuestionActivityBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val game = Game.actualGame

        val question = game?.getNextQuestion()

        binding.levelTitle.text =
            "Level: ${question?.level.toString()} Category ${question?.category?.name} ${
                game?.currentQuestion?.plus(
                    1
                )
            }/5"

        binding.questionOne.text = question?.question

        val options = question?.getQuestionsOption()

        options?.forEachIndexed { index, option ->
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
            val selectIndex = when (binding.options.checkedRadioButtonId) {
                binding.optionOne.id -> 0
                binding.optionTwo.id -> 1
                binding.optionThree.id -> 2
                binding.optionFour.id -> 3

                else -> -1
            }
            val gameState = game?.validateQuestion(options!![selectIndex].id)

            when (gameState) {
                GameState.WON -> startActivity(Intent(this, GameCompletedActivity::class.java))
                GameState.LOST -> startActivity(Intent(this, WrongAnswerActivity::class.java))
                GameState.NEXT_QUESTIONS -> startActivity(
                    Intent(
                        this,
                        ContinueActivity::class.java
                    )
                )
                GameState.NEXT_LEVEL -> startActivity(Intent(this, ContinueActivity::class.java))
                GameState.ENDED -> startActivity(Intent(this, EndGameActivity::class.java))
                null -> TODO()
            }
        }

    }
}