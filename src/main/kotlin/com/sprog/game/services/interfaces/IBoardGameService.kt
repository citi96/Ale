package com.sprog.game.services.interfaces

import com.sprog.game.models.GameBoard

interface IBoardGameService {

    fun addGameBoard() : GameBoard
    fun getGameBoard(id: Long): GameBoard
    fun deleteGameBoard(id: Long)
}