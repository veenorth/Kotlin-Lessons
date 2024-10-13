fun main() {
    print("Enter array: ")
    val array = readLine()!!.toCharArray()

    lastElement(array)
}

fun lastElement(array: CharArray) = println(array.last())