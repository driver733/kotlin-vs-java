val groups = numbers.groupBy {
    if (it % 2 == 0) "even" else "odd"
}
