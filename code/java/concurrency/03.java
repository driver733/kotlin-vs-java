List<Callable<ContentDuration>> callables = Stream.of("Service A", "Service B", "Service C")
        .map(DummyService::new)
        .map(service -> (Callable<ContentDuration>) service::getContent)
        .collect(Collectors.toList());

ExecutorService executor = Executors.newWorkStealingPool();
List<ContentDuration> results = executor.invokeAll(callables).stream()
.map(
    future -> {
         try {
             return future.get();
         } catch (InterruptedException | ExecutionException e) {
             throw new RuntimeException(e);
         }
    }
).collect(Collectors.toList());
