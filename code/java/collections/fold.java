private &ltT&gt Double calculateTotals(final Grid&ltT&gt grid) {
    return grid.getRows()
        .stream()
        .flatMap(e -> e.getColumns().stream())
        .collect(Collectors.groupingBy(Column::getTitle))
        .entrySet()
        .stream()
        .flatMap(e -> e.getValue().stream())
        .map(Column::getValue)
        .reduce(
            0.0,
            (accumulator, value) ->
                value instanceof Number
                    ? accumulator + ((Number) (value)).doubleValue()
                    : accumulator,
            Double::sum
        );

@Data // Lombok
class Grid&ltT&gt {
    private final List<Row&ltT&gt> rows;
}

@Data // Lombok
class Row&ltT&gt {
    private final List<Column&ltT&gt> columns;
}

@Data // Lombok
class Column&ltT&gt {
    private final String title;
    private final T value;
}