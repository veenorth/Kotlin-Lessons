fun main() {
    val intArray = arrayOf(1, 2, 3, 4, 5)
    var plus = 0
    var mult = 1

    for (i in 0..intArray.size - 1) {
        plus += intArray[i]
        mult *= intArray[i]
    }

    println("Сумма чисел: $plus\nПроизведение чисел: $mult")
}