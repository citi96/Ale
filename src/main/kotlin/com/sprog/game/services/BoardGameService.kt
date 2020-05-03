package com.sprog.game.services

import com.sprog.game.models.CellElement
import com.sprog.game.models.GameBoard
import com.sprog.game.repositories.GameBoardRepository
import com.sprog.game.services.interfaces.IBoardGameService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BoardGameService() : IBoardGameService {

    @Autowired
    private lateinit var  gameBoardRepo: GameBoardRepository
    override fun addGameBoard() : GameBoard {

        var gameBoard = GameBoard()
        var gameMap : Array<Array<CellElement>> = arrayOf()
        for (i in 1..15){
            for (j in 1..15){
                var cellElement = CellElement(null, i, j, null, "")
                gameMap[i][j] = cellElement
            }
        }
         return gameBoardRepo.save(gameBoard)
    }

    override fun getGameBoard(id: Long): GameBoard = gameBoardRepo.findById(id).get()


    override fun deleteGameBoard(id: Long) = gameBoardRepo.deleteById(id)
}