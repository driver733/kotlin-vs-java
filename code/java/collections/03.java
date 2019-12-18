final var groups = items.stream()
    .collect(
        Collectors.groupingBy(
            item -> (item % 2) == 0 ? "even" : "odd"
        )
);
