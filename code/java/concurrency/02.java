fun <A> inTransaction(f: (Connection) -> CompletableFuture<A>)
        : CompletableFuture<A> {
            return this.sendQuery("BEGIN").flatMap {
                _ ->
                    val p = CompletableFuture<A>()
                    f(this).onComplete {
                        ty1 ->
                        sendQuery(if (ty1.isFailure) "ROLLBACK" else "COMMIT")
                        .onComplete {
                            ty2 ->
                                if (ty2.isFailure && ty1.isSuccess)
                                    p.failed((ty2 as Failure).exception)
                                else
                                    p.complete(ty1)
                            }
                    }
                    p
            }
        }
