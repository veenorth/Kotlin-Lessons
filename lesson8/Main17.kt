fun main() {
    print("Enter number: ")
    val num = readln().toInt()

    println(factorial(num))
}

fun factorial(number: Int): Int {
    var factor = 1
    for (i in 1..number) factor *= i
    return factor
}