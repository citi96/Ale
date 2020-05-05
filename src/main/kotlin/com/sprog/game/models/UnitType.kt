package com.sprog.game.models

import javax.persistence.*

@Entity(name = "UNIT_TYPE")
data class UnitType(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,

        @Column(name = "NAME")
        val name: String = "",

        @ManyToOne
        val strongAgainst: UnitType? = null
)