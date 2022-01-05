package com.example.triviaapp.model

class Question(
    val category: Category,
    val question: String,
    private val options: List<Option>,
    val level: Int
) {
    fun isOptionRight(userOptionSelectedId: Int) : Boolean {
        var isRight : Boolean = false
        options.forEach {
            if (it.id == userOptionSelectedId) {
                isRight = it.correctQuestion
            }
        }
        return isRight
    }
}