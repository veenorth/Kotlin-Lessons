fun main() {
    println("Введите 2 числа:")
    val num1 = readln().toDouble()
    val num2 = readln().toDouble()

    if (num1 > num2) {
        println("$num1 > $num2")
    }
    else if (num1 < num2) {
        println("$num1 < $num2")
    }
    else {
        println("Ошибка")
    }
}