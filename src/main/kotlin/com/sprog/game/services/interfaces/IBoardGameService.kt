package com.sprog.game.services.interfaces

import com.sprog.game.models.GameBoard

interface IBoardGameService {

    public fun addGameBoard() : GameBoard
    public fun getGameBoard(id: Long): GameBoard
    public fun deleteGameBoard(id: Long)
}