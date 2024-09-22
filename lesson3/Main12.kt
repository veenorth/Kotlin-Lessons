fun main() {
    print("Введите двузначное число: ")
    val num = readln().toInt()
    val num1 = num / 10
    val num2 = num % 10

    if (num / 100 > 0) {
        println("\nВведите корректное число")
    }
    else if (num1 > num2) {
        println("\nПервая цифра - $num1 > второй цифры - $num2")
    }
    else if (num1 < num2) {
        println("\nВторая цифра - $num2 > первой цифры - $num1")
    }
    else {
        println("\nЦифры $num1 и $num2 одинаковы")
    }
}