fun main() {
    println("Введите 2 числа:")
    val num1 = readln().toInt()
    val num2 = readln().toInt()

    if (num1 > num2 && num1 % num2 != 0) {
        println("$num1 не кратно $num2")
        println(num1 % num2)
    }
    else {
        println("Ошибка")
    }
}