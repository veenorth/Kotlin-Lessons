fun main() {
    print("Enter text: ")
    val text = readLine()!!.toString()

    reversedCase(text)
}

fun reversedCase(string: String) {
    println(string.map { if (it.isUpperCase()) it.toLowerCase() else it.toUpperCase() }.joinToString().replace(", ", ""))
}