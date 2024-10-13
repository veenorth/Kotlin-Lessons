fun main() {
    print("Enter array: ")
    val array = readLine()!!.toCharArray()
    print("Enter index: ")
    val index = readln().toInt()

    searchElementByIndex(array, index)
}

fun searchElementByIndex(array: CharArray, index: Int) = println(array[index])