import kotlin.random.Random

fun main() {
    print("Введите размер массива: ")
    val sizeArray = readln().toInt()
    val intArray = Array (sizeArray, {Random.nextInt(1, 100)})
    val size = intArray.size

    if (intArray.size % 2 == 0) {
        intArray.sort()
        println("${intArray[size / 2 - 1]} ${intArray[size / 2]}")
    }
    else {
        intArray.sort()
        println(intArray[size / 2])
    }
}