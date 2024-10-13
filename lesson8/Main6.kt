fun main() {
    println("Enter 2 numbers:")
    val num1 = readln().toInt()
    val num2 = readln().toInt()

    println(less100(num1, num2))
}

fun less100(num1: Int, num2: Int): Boolean {
    if (num1 + num2 < 100) return true
    return false
}