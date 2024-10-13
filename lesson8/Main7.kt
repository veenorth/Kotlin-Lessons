fun main() {
    print("Enter number: ")
    val num = readln().toInt()

    println(divide(num))
}

fun divide(num: Int): Boolean {
    if (num / 100 != 0) return true
    return false
}