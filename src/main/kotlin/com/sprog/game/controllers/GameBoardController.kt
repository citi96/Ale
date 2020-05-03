package com.sprog.game.controllers

import com.sprog.game.models.GameBoard
import com.sprog.game.services.BoardGameService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController("/gameboard")
class GameBoardController {

    @Autowired
    private lateinit var boardGameService: BoardGameService

    @PostMapping()
    fun addNewGameBoard(): GameBoard = boardGameService.addGameBoard()

    @GetMapping("/{gameBoardId}")
    fun findGameBoardById(@PathVariable("gameBoardId") gameboardId: Long): GameBoard = boardGameService.getGameBoard(gameboardId)

    @DeleteMapping("/{gameBoardId}")
    fun deleteGameBoardById(@PathVariable("gameBoardId") gameboardId: Long) = boardGameService.deleteGameBoard(gameboardId)

}