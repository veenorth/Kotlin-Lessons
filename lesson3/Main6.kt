fun main() {
    println("Введите год:")
    val year = readln().toInt()

    if (year % 4 == 0) {
        println("$year - високосный")
    }
    else {
        println("$year - не високосный")
    }
}