var filtered = numbers
    .stream()
    .filter(num -> num > 5)
    .collect(Collectors.toList())