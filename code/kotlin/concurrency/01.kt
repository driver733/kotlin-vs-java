suspend fun loadAndCombine(name1: String, name2: String): Image =
        coroutineScope {
            val deferred1 = async { loadImage(name1) }
            val deferred2 = async { loadImage(name2) }
            combineImages(deferred1.await(), deferred2.await())
        }