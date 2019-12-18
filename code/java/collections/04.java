final var partitioned = numbers.stream()
        .collect(
            Collectors.partitioningBy(num -> num % 2 == 0)
        );

final var evens = partitioned.get(true);
final var odds = partitioned.get(false);
