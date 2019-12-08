final List&ltInteger&gt evens = new ArrayList<>();
final List&ltInteger&gt odds = new ArrayList<>();

Map<Boolean, List<Integer>> map = numbers.stream()
        .collect(
            Collectors.partitioningBy(num -> num % 2 == 0)
        );