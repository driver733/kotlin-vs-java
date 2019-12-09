final Map<String, Currency> map = currencies.stream()
        .collect(
            Collectors.toMap(
                Currency::getCode,
                Function.identity()
            )
        );