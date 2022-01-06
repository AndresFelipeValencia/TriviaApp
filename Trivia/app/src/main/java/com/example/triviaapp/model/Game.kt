package com.example.triviaapp.model

import com.example.triviaapp.data.QuestionsDataSource

const val GAME_LEVELS = 5

class Game(private val levels: List<Level>)  {
    var currentLevel: Int = 0
    var totalPoint: Int = 0
    var currentQuestion: Int = 0

    fun createLevel() {

    }

    fun getNextQuestion() : Question {
        val question = levels [currentLevel].listQuestion [currentQuestion]
        return question
    }

    fun validateQuestion(userOptionSelectedId: Int) : GameState {
        val question = levels [currentLevel].listQuestion [currentQuestion]
        return if (question.isOptionRight(userOptionSelectedId)) {
            totalPoint += currentLevel.plus(1)
            if (currentQuestion == getMaxLevel() && currentLevel == getMaxLevel()) {
                GameState.WON
            } else if ( currentQuestion == getMaxLevel()) {
                currentLevel ++
                currentQuestion = 0
                GameState.NEXT_LEVEL
            } else {
                currentQuestion ++
                GameState.NEXT_QUESTIONS
            }
        } else {
            GameState.LOST
        }
    }

    fun getMaxLevel() = GAME_LEVELS -1

    companion object {
        var actualGame : Game ? = null
        fun startGame() {
            val levels = mutableListOf<Level>()
            for (i in 1..GAME_LEVELS) {
                levels.add(Level(QuestionsDataSource.getQuestionByLevel(i)))
            }
            actualGame = Game(levels)
        }
    }

}