public CompletableFuture&ltSomeOtherResult&gt loadAndCombine(String name1, String name2){
        loadImageAsync(name1)
            .thenAcceptBoth(loadImageAsync(name2)) ((one, two) -> {
                combineImages(one, two)
        )}
}
