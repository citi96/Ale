package com.sprog.game.models

import javax.persistence.*

@Entity(name = "UNIT_CLASS_TRAIT")
data class UnitClassTrait(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,

        @Column(name = "NAME")
        val name: String = ""
)
