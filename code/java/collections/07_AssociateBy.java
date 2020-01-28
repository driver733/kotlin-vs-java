final var map = currencies.stream()
    .collect(
        Collectors.toMap(
            Currency::getCode,
            Function.identity()
        )
    );