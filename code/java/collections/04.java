Map&ltBoolean, List&ltInteger&gt&gt partitioned = numbers.stream()
        .collect(
            Collectors.partitioningBy(num -> num % 2 == 0)
        );

final List&ltInteger&gt evens = partitioned.get(true);
final List&ltInteger&gt odds = partitioned.get(false);
