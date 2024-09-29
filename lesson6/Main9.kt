fun main() {
    val intArrayOriginal = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Оригинальный массив: ${intArrayOriginal.joinToString()}")

    val intArrayCopy = intArrayOriginal.copyOf()
    println("Скопированный массив: ${intArrayCopy.joinToString()}")
}