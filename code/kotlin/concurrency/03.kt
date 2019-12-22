val DummyService.asyncContent: Deferred&ltContentDuration&gt
    get() = async(CommonPool) { content }

var results = runBlocking {
    arrayOf("Service A", "Service B", "Service C")
        .map { DummyService(it) }
        .map { it.asyncContent }
        .map { it.await() }
}
