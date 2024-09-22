fun main() {
    println("Введите 3 стороны треугольника:")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()

    if (num1 > (num2 + num3)) {
        println("Ошибка")
    }
    else if (num2 > (num1 + num3)) {
        println("Ошибка")
    }
    else if (num3 > (num2 + num1)) {
        println("Ошибка")
    }
    else {
        println("Треугольник существует")
    }
}