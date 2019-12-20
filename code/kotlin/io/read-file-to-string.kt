var content: String?
try {
    content = File("doc.txt").readText()
} catch (e: IOException) {
    e.printStackTrace()
    content = null
}
println(content)