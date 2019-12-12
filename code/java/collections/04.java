final List&ltInteger&gt evens = new ArrayList<>();
final List&ltInteger&gt odds = new ArrayList<>();

Map&ltBoolean, List&ltInteger&gt&gt map = numbers.stream()
        .collect(
            Collectors.partitioningBy(num -> num % 2 == 0)
        );