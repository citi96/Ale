package com.sprog.game.models

import javax.persistence.*

@Entity(name = "CELL_ELEMENT")
data class CellElement(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,

        @Column(name = "COORDINATE_ON_X")
        var coordinateOnX: Int,

        @Column(name = "COORDINATE_ON_Y")
        var coordinateOnY: Int,

        @Column(name = "ENTITY_ID")
        val entityId: Long? = null,


        @Column(name = "ENTITY_TYPE")
        val entityTipe: String? = ""
)