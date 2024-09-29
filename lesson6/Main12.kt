fun main() {
    val intArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println("Массив: ${intArray.joinToString()}\nКакие элементы по индексу вы хотите поменять местами?")
    val index1 = readln().toInt()
    val index2 = readln().toInt()
    val value = intArray[index1]

    intArray[index1] = intArray[index2]
    intArray[index2] = value


    println("Новый массив: ${intArray.joinToString()}")
}