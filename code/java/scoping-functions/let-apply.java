public File makeDir(String path) {
    val result = new File(path);
    result.mkdirs();
    return result;
}