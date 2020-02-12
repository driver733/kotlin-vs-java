var file = new File("contents.txt");
try {
    var fileReader = new FileReader(file);
    try (var bufferedReader = new BufferedReader(fileReader)) {
        // the bufferedReader is closed automatically
    }
} catch (IOException ex) {
    // handle the exception
}