val personsSorted = listOf(
    Pair("Bob C.", 5), Pair("Alex G.", 10), Pair("Alex G.", 12)
).sortedWith(
    compareByDescending<Pair<String, Int>> { it.second }
        .thenBy { it. first }
)