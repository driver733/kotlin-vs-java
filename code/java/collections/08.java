final List<Integer> numbers = List.of(1, 2, 3);
final List<String> names = List.of("Jack", "Michael", "Bob");
IntStream
    .range(0, Math.min(names.size(), ages.size()))
    .mapToObj(i -> names.get(i) + ":" + ages.get(i))
    .collect(Collectors.toList());