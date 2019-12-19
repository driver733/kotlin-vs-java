final var topPaidEmployee = Map.of(
    "Alex", 250,
    "Boss", 999,
    "Chris", 400
).entrySet()
    .stream()
    .filter(employee -> !employee.getValue().equals("Boss"))
    .collect(
        Collectors.collectingAndThen(
            Collectors.maxBy(Comparator.comparing(Map.Entry::getValue)),
            employee -> {
                if (employee.isPresent() {
                    return employee.getKey(); 
                }
                throw new IllegalStateException("No employees");
            }
        )
    );