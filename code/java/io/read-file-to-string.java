String content = null;
try {
    content = Files
        .lines(
            Paths.get("doc.txt"), StandardCharsets.UTF_8
        ).collect(
            Collectors.joining(System.lineSeparator())
        );
} catch (IOException e) {
    e.printStackTrace();
}

