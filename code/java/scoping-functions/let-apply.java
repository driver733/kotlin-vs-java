public File makeDir(String path) {
    final var result = new File(path);
    result.mkdirs();
    return result;
}