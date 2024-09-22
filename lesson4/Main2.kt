fun main() {
    println("Введите длины сторон треугольника:")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()

    if (num1 > (num2 + num3) || num2 > (num1 + num3) || num3 > (num1 + num2)) {
        println("Треугольник не существует")
        return
    }
    when {
        num1 == num2 || num1 == num3 || num2 == num3 -> println("Треугольник равнобедренный ")
        (num1 == num2) && (num2 == num3) -> println("Треугольник равностороний")
        else -> println("Треугольник разностороний")
    }
}