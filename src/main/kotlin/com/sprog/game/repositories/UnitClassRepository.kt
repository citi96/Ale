package com.sprog.game.repositories

import com.sprog.game.models.UnitClass
import org.springframework.data.jpa.repository.JpaRepository

interface UnitClassRepository : JpaRepository<UnitClass, Long> {
}