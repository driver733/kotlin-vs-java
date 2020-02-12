File("contents.txt")
    .bufferedReader()
    .use {
        // the bufferedReader is closed automatically
    }