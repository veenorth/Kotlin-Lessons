import java.util.stream.IntStream

fun main() {
    print("Enter array: ")
    val array = readLine()!!.toCharArray()
    print("Enter element: ")
    val element = readln()[0]

    findElement(array, element)
}

fun findElement(array: CharArray, element: Char) {
    var found = 0
    for (i in 0..array.size - 1) {
        if (array[i] == element) found++
    }

    if (found > 0) println("Element $element founded $found times")
    else println("Element $element not found")
}