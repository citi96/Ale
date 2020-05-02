package com.sprog.game.services

import com.sprog.game.models.CellElement
import com.sprog.game.models.GameBoard
import com.sprog.game.repositories.GameBoardRepository
import com.sprog.game.services.interfaces.IBoardGameService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BoardGameService(private val gameBoardRepo: GameBoardRepository) : IBoardGameService {


    override fun addGameBoard() {
        //TODO: creare game board

        var gameBoard = GameBoard()

        //gameBoard.cellElements =
        gameBoardRepo.save(gameBoard)
    }

    override fun getGameBoard(id: Long): GameBoard = gameBoardRepo.findById(id).get()


    override fun deleteGameBoard(id: Long) = gameBoardRepo.deleteById(id)
}