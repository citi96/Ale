package com.sprog.game.models

import javax.persistence.*

@Entity(name = "UNIT_CLASS")
data class UnitClass(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,

        @Column(name = "NAME")
        val name: String = "",

        @OneToOne
        val trait: UnitClassTrait? = null
)
