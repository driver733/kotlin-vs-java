final var result = Optional.ofNullable(nullableVariable)
    .flatMap(v -> Optinal.ofNullable(v.someNullableMethodCall()))
    .orElseGet(() -> fallbackIfNullMethodCall())