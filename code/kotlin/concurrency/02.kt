suspend fun <A> inTransaction(
    f: suspend (Connection) -> A): A {
    try {
        this.sendQuery("BEGIN")
        val result = f(this)
        this.sendQuery("COMMIT")
        return result
    } catch (e: Throwable) {
        this.sendQuery("ROLLBACK")
        throw e
    }
}

