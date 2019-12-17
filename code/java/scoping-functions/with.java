val numbers = List.of("one", "two", "three");
with(numbers) {
    val firstItem = numbers.get(0);
    val lastItem = numbers.get(numbers.size() - 1);
    System.out.println("First item: " + firstItem + ", last item: " + lastItem);
}