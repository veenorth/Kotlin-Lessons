fun main() {
    println("Введите строку:")
    val text = readln()

    lengthOfWords(text)
}

fun lengthOfWords(text: String) {
    val words = text.split("\\s+".toRegex()).filter { it.isNotBlank() }.maxByOrNull { it.length }

    println(words.toString())
}