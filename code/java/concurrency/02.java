public <A> CompletableFuture<A> inTransaction(DatabaseFunction<A> fun) {
    return CompletableFuture
    .runAsync(() -> this.sendQuery("BEGIN"))
    .thenApply(ignored -> fun.execute(this))
    .thenApply(s -> {
        this.sendQuery("COMMIT");
        return s;
    })
        .exceptionally(throwable -> {
        this.sendQuery("ROLLBACK");
        return null;
    });
}
