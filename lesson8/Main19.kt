fun main() {
    print("Enter array numbers: ")
    val intArray = readLine()!!.split(" ").map { it.toInt() }

    arraySum(intArray)
}

fun arraySum(intArray: List<Int>) = println(intArray.sum())