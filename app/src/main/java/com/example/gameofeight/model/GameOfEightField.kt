package com.example.gameofeight.model

class GameOfEightField(val rows: Int, val columns: Int) {
    private val cells = Array(rows) { Array(columns) {Cell.EMPTY} }

    fun getCell(row: Int, column: Int): Cell {
        if (row < 0 || column < 0 || row > rows || column >= columns) return Cell.EMPTY
        return cells[row][column]
    }

    fun setCell(row: Int, column: Int, cell: Cell){
        if (row < 0 || column < 0 || row > rows || column >= columns) return
        cells[row][column] = cell
    }
}