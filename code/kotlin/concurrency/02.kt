suspend fun &ltT&gt inTransaction(
    f: suspend (Connection) -> T): T {
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

