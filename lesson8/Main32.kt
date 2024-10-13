fun main() {
    print("Enter text: ")
    val text = readLine()!!.toString()

    reverse(text)
}

fun reverse(text: String) = println(text.reversed())