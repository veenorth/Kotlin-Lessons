fun main() {
    val intArray1 = arrayOf(1, 2, 3, 4, 5)
    val intArray2 = arrayOf(6, 7, 8, 9, 10)
    val intArray = arrayOf(*intArray1, *intArray2)

    println(intArray.joinToString())
}