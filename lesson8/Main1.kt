fun main() {
    print("Enter array integer: ")
    val intArray = readLine()!!.split(" ").map { it.toInt() }

    println(sumArray(intArray))
}

fun sumArray(array: List<Int>): Int {
    val intArray = array.sum()

    return  intArray
}