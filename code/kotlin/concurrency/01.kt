suspend fun doSequentially() {
    val something = doSomething()
    doSomethingElse(something)
}

suspend fun doBoth() = coroutineScope {
    val deferredOne = async { doSomething() }
    val two = doSomethingElse() // while doSomething is working
    val one = deferredOne.await()
    // combine results of both calls here
}