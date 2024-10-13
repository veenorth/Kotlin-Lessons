fun main() {
    print("Enter first text: ")
    val firstText = readLine()!!.toString()

    sortString(firstText)
}

fun sortString(textOne: String) = println(textOne.toCharArray().sorted()
    .joinToString().replace(",", "").filter { !it.isWhitespace() })