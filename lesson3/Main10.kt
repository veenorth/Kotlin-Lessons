fun main() {
    println("Введите 2 числа:")
    val num1 = readln().toDouble()
    val num2 = readln().toDouble()

    println("Выберите делитель. 1 - $num1\n2 - $num2")
    val divider = readln().toInt()

    if (divider == 1) {
        println(num2/num1)
        println("Делитель - $num1")
    }
    else if (divider == 2) {
        println(num1 / num2)
        println("Делитель - $num2")
    }
    else {
        println("Ошибка")
    }
}