val topPaidEmployee = listOf("Alex" to 250, "Boss" to 999, "Chris" to 400)
    .filter { it.first != "Boss" }
    .maxBy { it.second }
    ?.run { first }
    ?: throw IllegalStateException("No employees")