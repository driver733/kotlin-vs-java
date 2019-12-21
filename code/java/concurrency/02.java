fun &ltA&gt inTransaction(f: (Connection) -> CompletableFuture&ltA&gt)
        : CompletableFuture&ltA&gt {
            return this.sendQuery("BEGIN").flatMap {
                _ ->
                    val p = CompletableFuture&ltA&gt()
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
