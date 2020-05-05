package com.sprog.game.repositories

import com.sprog.game.models.UnitClassTrait
import org.springframework.data.jpa.repository.JpaRepository

interface UnitClassTraitRepository : JpaRepository<UnitClassTrait, Long> {
}