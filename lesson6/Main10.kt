fun main() {
    val intArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var evenNum = 0

    for (i in 0..intArray.size - 1) {
        if (intArray[i] % 2 == 0) {
            evenNum += intArray[i]
        }
    }

    println("Сумма всех четных чисел в массиве: $evenNum")
}