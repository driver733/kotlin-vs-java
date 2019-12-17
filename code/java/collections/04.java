Map&ltBoolean, List&ltInteger&gt&gt map = numbers.stream()
        .collect(partitioningBy(num -> num % 2 == 0));
