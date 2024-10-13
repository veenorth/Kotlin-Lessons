fun main() {
    print("Enter text: ")
    val text = readLine()!!.toString()

    deleteSpace(text)
}

fun deleteSpace(text: String) = println(text.filter { !it.isWhitespace() })