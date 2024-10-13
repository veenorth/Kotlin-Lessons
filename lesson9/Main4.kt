fun main() {
    print("Enter first text: ")
    val firstText = readLine()!!.toString()
    print("Enter second text: ")
    val secondText = readLine()!!.toString()

    anagrams(firstText, secondText)
}

fun anagrams(textOne: String, textTwo: String) {
    val textOneArray = textOne.filter { !it.isWhitespace() }.toCharArray().sorted()
    val textTwoArray = textTwo.filter { !it.isWhitespace() }.toCharArray().sorted()

    if (textOneArray == textTwoArray) println("This texts is anagrams")
    else println("This texts isn't anagrams")
}