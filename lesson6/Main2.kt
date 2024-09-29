fun main() {
    val mas = arrayOf(1, 2, 3, 4, 5)
    var num = 0

    for (i in 0..4) {
        num += mas[i]
    }

    println("Сумма чисел: $num")
}