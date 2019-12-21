final var result = Optional.ofNullable(nullableVariable)
    .flatMap(v -> Optional.ofNullable(v.someNullableMethodCall()))
    .orElseGet(() -> fallbackIfNullMethodCall())
