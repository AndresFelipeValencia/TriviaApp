package com.example.triviaapp.data

import com.example.triviaapp.model.Player

object PlayerDataSource {
    private var listPlayer: MutableList<Player> = mutableListOf()

    fun getPlayerList() : List<Player> {
        return listPlayer
    }

    fun addNewPlayer(name: String, point: Int) {
        val player = Player(name, point)
        listPlayer.add(player)
    }

}
