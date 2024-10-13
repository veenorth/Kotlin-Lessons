fun main() {
    print("Enter array integer: ")
    val intArray = readLine()!!.split(" ").map { it.toInt() }

    minMax(intArray)
}

fun minMax(intArray: List<Int>) = println("Minimum value ${intArray.min()}\nMaximum value ${intArray.max()}")