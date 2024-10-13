fun main() {
    print("Enter 2 numbers: ")
    val number = readLine()!!.split(" ").map { it.toInt() }

    println(plus(number))
}

fun plus(numbers: List<Int>) = numbers.sum()