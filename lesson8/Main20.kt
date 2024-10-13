fun main() {
    print("Enter array numbers: ")
    val intArray = readLine()!!.split(" ").map { it.toInt() }

    numberMax(intArray)
}

fun numberMax(intArray: List<Int>) = println(intArray.max())