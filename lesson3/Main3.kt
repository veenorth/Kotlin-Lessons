fun main() {
    println("Введите 2 числа:")
    val num1 = readln().toInt()
    val num2 = readln().toInt()

    if (num1%2 == 0 && num2%2 == 1) {
        println(num1)
    }
    else if (num2%2 == 0 && num1%2 == 1) {
        println(num2)
    }
    else {
        println("Ошибка")
    }
}