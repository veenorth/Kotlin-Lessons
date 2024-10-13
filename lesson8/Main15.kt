fun main() {
    print("Enter 2 numbers: ")
    val numbers = readLine()!!.split(" ").map { it.toInt() }

    println(maxNumber(numbers))
}

fun maxNumber(number: List<Int>) = println(number.max())