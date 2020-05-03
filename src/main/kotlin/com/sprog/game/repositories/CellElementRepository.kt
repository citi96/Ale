package com.sprog.game.repositories

import com.sprog.game.models.CellElement
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CellElementRepository: CrudRepository<CellElement, Long>{
}