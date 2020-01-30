fun &ltT&gt calculateTotals(grid: Grid&ltT&gt) =
    grid.rows
        .flatMap(Row&ltT&gt::columns)
        .groupingBy(Column&ltT&gt::title)
        .fold(0.0) {
            accumulator,
            (_, value) ->
                accumulator +
                        when (value) {
                            is Number -> value.toDouble()
                            else -> 0.0
                        }
        }

data class Grid&ltT&gt(val rows: List<Row&ltT&gt>)
data class Row&ltT&gt(val columns: List<Column&ltT&gt>)
data class Column&ltT&gt(val title: String, val value: T)

// https://kotlinexpertise.com/kotlin-productivity/