package com.sprog.game.repositories

import com.sprog.game.models.UnitType
import org.springframework.data.jpa.repository.JpaRepository

interface UnitTypeRepository : JpaRepository<UnitType, Long> {
}