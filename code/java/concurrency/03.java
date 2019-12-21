final var callables = Stream.of("Service A", "Service B", "Service C")
        .map(DummyService::new)
        .map(service -> (Callable&ltContentDuration&gt) service::getContent)
        .collect(Collectors.toList());

final var executor = Executors.newWorkStealingPool();
final var results = executor.invokeAll(callables).stream()
    .map(
        future -> {
             try {
                 return future.get();
             } catch (InterruptedException | ExecutionException e) {
                 throw new RuntimeException(e);
             }
        }
    ).collect(Collectors.toList());
