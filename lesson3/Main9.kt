fun main() {
    println("Введите 2 числа: ")
    val m = readln().toInt()
    val n = readln().toInt()

    if (m % n == 0) {
        println(m/n)
    }
    else {
        println("m на n нацело не делится")
    }
}