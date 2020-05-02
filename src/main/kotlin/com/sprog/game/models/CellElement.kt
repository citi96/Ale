package com.sprog.game.models

import javax.persistence.*

@Entity(name = "CELL_ELEMENT")
data class CellElement(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,

        @Column(name = "COORDINATE_ON_X")
        val coordinateOnX: Long? = 0,

        @Column(name = "COORDINATE_ON_Y")
        val coordinateOnY: Long? = 0,

        @Column
        @ManyToOne
        @JoinColumn(name = "GAME_BOARD")
        val boardMap: GameBoard,

        @Column(name = "ENTITY_ID")
        val entityId: Long? = null,


        @Column(name = "ENTITY_TYPE")
        val entityTipe: String? = ""
)