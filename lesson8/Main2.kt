fun main() {
    print("Enter array integer: ")
    val intArray = readLine()!!.split(" ").map { it.toInt() }

    println(differenceMaxMin(intArray))
}

fun differenceMaxMin(array: List<Int>): Int {
    val result = array.max() - array.min()

    return result
}