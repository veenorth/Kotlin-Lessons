fun main() {
    println("Enter two texts:")
    val textOne = readLine().toString()
    val textTwo = readLine().toString()

    joinText(textOne, textTwo)
}

fun joinText(textOne: String, textTwo: String) = println(textOne + textTwo)