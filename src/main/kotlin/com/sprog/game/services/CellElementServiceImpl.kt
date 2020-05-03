package com.sprog.game.services

import com.sprog.game.models.CellElement
import com.sprog.game.repositories.CellElementRepository
import com.sprog.game.services.interfaces.ICellElementService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CellElementServiceImpl() : ICellElementService {
    @Autowired
    private lateinit var cellElementRepository: CellElementRepository

    override fun saveCellElement() = cellElementRepository.save(CellElement(null, 50, 50, 0, ""))


    override fun getCellElement(id: Long): CellElement = cellElementRepository.findById(id).get()

    override fun deleteCellElement(id: Long) = cellElementRepository.deleteById(id)
}