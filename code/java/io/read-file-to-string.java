String content = null;
try {
    content = Files.readString(filePath);
} catch (IOException e) {
    e.printStackTrace();
}
System.out.println(content);
