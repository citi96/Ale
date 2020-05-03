package com.sprog.game.models

import javax.persistence.*

@Entity(name = "GAME_BOARD")
data class GameBoard(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,
        @OneToMany
        var cellElements: List<CellElement>? = null
)