fun main() {
    print("Enter array integer 1: ")
    val intArray1 = readLine()!!.split(" ").map { it.toInt() }

    print("Enter array integer 2: ")
    val intArray2 = readLine()!!.split(" ").map { it.toInt() }

    println(arraysJoin(intArray1, intArray2))
}

fun arraysJoin(array1: List<Int>, array2: List<Int>): List<Int> {
    val joinArray = array1 + array2

    return joinArray
}