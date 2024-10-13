fun main() {
    print("Enter array int: ")
    val intArray = readLine()!!.split(" ").map { it.toInt() }

    sort(intArray)
}

fun sort(intArray: List<Int>) = println(intArray.sorted())