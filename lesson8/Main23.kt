fun main() {
    print("Enter text: ")
    val text = readLine().toString()

    sizeSymbol(text)
}

fun sizeSymbol(text: String) = println(text.length)