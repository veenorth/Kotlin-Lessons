fun main() {
    val intArray1 = arrayOf(1, 2, 4, 5, 7, 8, 10)
    val intArray2 = arrayOf(2, 3, 5, 6, 8, 9, 11)

    println("Пересечение массивов:")

    for (i in 0..intArray1.size - 1) {
        for (j in 0..intArray2.size - 1)
        if (intArray1[i] == intArray2[j]) {
            println(intArray1[i])
        }
    }
}