package com.sprog.game.services.interfaces

import com.sprog.game.models.CellElement

interface ICellElementService {

    public fun saveCellElement() : CellElement
    public fun getCellElement(id: Long) : CellElement
    public fun deleteCellElement(id: Long)
}