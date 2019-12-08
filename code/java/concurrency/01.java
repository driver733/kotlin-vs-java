fun doBothAsync(): CompletableFuture<SomeOtherResult> =
    doSomethingAsync().thenAcceptBoth(doSomethingElseAsync()) {
        one, two -> // combine results of both calls here
    }

fun doSequentiallyAsync(): CompletableFuture<SomeOtherResult> =
    doSomethingAsync().thenCompose {
            something -> doSomethingElseAsync(something)
    }
