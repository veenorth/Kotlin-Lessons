fun main() {
    print("Enter text: ")
    val text = readLine()!!.toString()

    sizeString(text)
}

fun sizeString(string: String) = println(string.length)