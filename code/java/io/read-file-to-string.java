try {
    String content = new String(Files.readAllBytes(Paths.get("doc.txt"), UTF_8));
} catch (IOException e) {
    throw new UncheckedIOException(r);
}
