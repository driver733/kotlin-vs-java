public CompletableFuture&ltSomeOtherResult&gt doBothAsync(){
    doSomethingAsync()
        .thenAcceptBoth(doSomethingElseAsync()) (
                (one, two) -> {
            // combine results of both calls here
        )}
}


public CompletableFuture&ltSomeOtherResult&gt doSequentiallyAsync() {
    doSomethingAsync().thenCompose(
        something -> {
            doSomethingElseAsync(something)
    })
}
