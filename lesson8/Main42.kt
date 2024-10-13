import kotlin.random.Random

// Как сделать с не инт массивом не понимаю

fun main() {
    val intArray = Array<Int>(5){Random.nextInt(1, 100)}
    print("Enter element: ")
    val element = readln().toInt()

    indexOfOccurrence(intArray, element)
    //println(intArray.joinToString())
}

fun indexOfOccurrence(intArray: Array<Int>, element: Int) = println(intArray.indexOf(element))