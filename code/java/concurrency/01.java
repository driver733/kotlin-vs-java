public CompletableFuture<SomeOtherResult> doBothAsync(){
    doSomethingAsync()
        .thenAcceptBoth(doSomethingElseAsync()) (
                (one, two) -> {
            // combine results of both calls here
        )}
}


public CompletableFuture<SomeOtherResult> doSequentiallyAsync() {
    doSomethingAsync().thenCompose(
        something -> {
            doSomethingElseAsync(something)
    })
}
