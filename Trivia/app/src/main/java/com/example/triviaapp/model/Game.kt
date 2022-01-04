package com.example.triviaapp.model

class Game() {
    private val levels: MutableList<Level> = mutableListOf()
    private var currentLevel: Int = 1
    var totalPoint: Int = 0
    private var currentQuestion: Int = 1

    fun createLevel() {

    }

    fun startGame() {
    }

    fun getNextQuestion() : Question {
        val question = levels [currentLevel].listQuestion [currentQuestion]
        return question
    }

    fun validateQuestion(userOptionSelectedId: Int) : GameState {
        val question = levels [currentLevel].listQuestion [currentQuestion]
        return if (question.isOptionRight(userOptionSelectedId)) {
            if (currentQuestion == 5 && currentLevel == 5) {
                GameState.WON
            } else if ( currentQuestion == 5) {
                currentLevel ++
                currentQuestion = 1
                GameState.NEXT_LEVEL
            } else {
                currentQuestion ++
                GameState.NEXT_QUESTIONS
            }
        } else {
            GameState.LOST
        }
    }

}