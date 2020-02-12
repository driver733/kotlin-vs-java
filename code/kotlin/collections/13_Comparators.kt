val personsSorted = listOf(
    Pair("Bob C.", 5), Pair("Alex G.", 10), Pair("Alex G.", 12)
).sortedWith(
    compareByDescending&ltPair&ltString, Int&gt&gt { it.second }
        .thenBy { it. first }
)