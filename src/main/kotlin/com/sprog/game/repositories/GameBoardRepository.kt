package com.sprog.game.repositories

import com.sprog.game.models.GameBoard
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

interface GameBoardRepository : JpaRepository<GameBoard, Long> {
}