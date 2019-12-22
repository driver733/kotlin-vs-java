public <T> CompletableFuture<T> inTransaction(DatabaseFunction<T> fun) {
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
