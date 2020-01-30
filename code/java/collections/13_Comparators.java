var persons = List.of(
    new Person("Bob C.", 5), new Person("Alex G.", 10), new Person("Alex G.", 12)
);
persons.sort(
    Comparator
        .comparing(Person::getScore, Comparator.reverseOrder())
        .thenComparing((Person::getName), Comparator.naturalOrder())
);
// [(Alex G., 12), (Alex G., 10), (Bob C., 5)]

@Data // Lombok
class Person {
    private final String name;
    private final Integer score;
}

