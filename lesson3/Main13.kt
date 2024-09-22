fun main() {
    print("Введите четырехзначное число: ")
    val num = readln().toInt()
    print("\nВведите число a: ")
    val a = readln().toInt()
    val sumfirstNumbers = ((num / 1000) + (num / 100 % 10))
    val sumsecondNumbers = ((num % 10) + (num % 100 / 10))
    val sumNumbers = sumfirstNumbers + sumsecondNumbers
    val multNumbers = ((num / 1000) * (num / 100 % 10) * (num % 10) * (num % 100 / 10))

    if (num / 10000 > 0) {
        println("\nВведите корректное число")
    }
    if (sumfirstNumbers == sumsecondNumbers) {
        println("\nСумма первых двух цифр = сумме двух последних цифр")
    }
    if (sumNumbers % 3 == 0) {
        println("\nСумма чисел кратна 3")
    }
    if (multNumbers % 4 == 0) {
        println("\nПрозиведение чисел кратно 4")
    }
    if (multNumbers % a == 0) {
        println("\nПроизведение числе кратно числу a")
    }

    println("\n\nВведенное число - $num\nЧисло а - $a\nСумма первых двух цифр - $sumfirstNumbers\nСумма вторых двух цифр" +
            " - $sumsecondNumbers\nСумма всех цифр - $sumNumbers\nПроизведение цифр - $multNumbers")
}