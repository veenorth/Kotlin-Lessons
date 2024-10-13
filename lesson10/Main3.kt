fun main() {
    print("Enter text: ")
    val text = readLine().toString()

    println(caesarsCipher(text))
}

fun caesarsCipher(text: String): String {
    val index = 3
    return text.map { char -> when {
            char.isUpperCase() -> ('A' + (char - 'A' + index) % 26)
            char.isLowerCase() -> ('a' + (char - 'a' + index) % 26)
            else -> char
        }
    }.joinToString("")
}