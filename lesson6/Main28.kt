fun main() {
    print("Введите массив: ")
    val numInArray = readLine()
    val intArray = arrayOf(numInArray)

    println(intArray.joinToString())
}