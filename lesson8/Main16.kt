fun main() {
    print("Enter number: ")
    val number = readln().toInt()

    println(parity(number))
}

fun parity(num: Int): Boolean {
    if (num % 2 == 0) return true
    return false
}