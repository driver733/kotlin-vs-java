final var numbers = List.of(1, 2, 3);
final var names = List.of("Jack", "Michael", "Bob");
IntStream
    .range(0, Math.min(names.size(), ages.size()))
    .mapToObj(i -> names.get(i) + ":" + ages.get(i))
    .collect(Collectors.toList());