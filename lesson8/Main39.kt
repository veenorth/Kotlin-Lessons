fun main() {
    print("Enter array integer: ")
    val intArray = readLine()!!.split(" ").map { it.toInt() }

    reverseArray(intArray)
}

fun reverseArray(intArray: List<Int>) = println(intArray.reversed())