final String text;
try {
    text = Files.lines(
        Paths.get("something.txt"),
        Collectors.joining()
    )
} catch(IOException ex) {
    throw new RuntimeException(ex);
}
