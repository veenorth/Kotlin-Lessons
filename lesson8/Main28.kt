fun main() {
    print("Enter up to what date the array will be created: ")
    val N = readln().toInt()

    println(createArray(N).joinToString())
}

fun createArray(N: Int): IntArray {
    val intArray = IntArray(N)
    var num = 1

    for (i in 0..N - 1) {
        intArray[i] = num
        num++
    }

    return intArray
}