String content = null;
try {
    content = Files.readString(filePath);
} catch (IOException e) {
    e.printStackTrace();
}
