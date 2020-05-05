package com.sprog.game.services.interfaces

import com.sprog.game.models.CellElement

interface ICellElementService {

    fun saveCellElement() : CellElement
    fun getCellElement(id: Long) : CellElement
    fun deleteCellElement(id: Long)
}