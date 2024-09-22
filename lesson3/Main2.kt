fun main() {
    println("Введите 3 числа:")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()

    if ((num2 > num1 && num1 > num3) || (num3 > num1 && num1 > num2)) {
        println(num1)
    }
    else if ((num1 > num2 && num2 > num3) || (num3 > num2 && num2 > num1)) {
        println(num2)
    }
    else if ((num1 > num3 && num3 > num2) || (num2 > num3 && num3 > num1)) {
        println(num3)
    }
    else {
        println("Ошибка")
    }
}