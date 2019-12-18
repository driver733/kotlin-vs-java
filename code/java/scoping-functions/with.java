val numbers = List.of("one", "two", "three");
with(numbers) {
    final var firstItem = numbers.get(0);
    final var lastItem = numbers.get(numbers.size() - 1);
    System.out.println("First item: " + firstItem + ", last item: " + lastItem);
}