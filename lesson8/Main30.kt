fun main() {
    print("Enter up to what date the array will be created: ")
    val N = readln().toInt()

    createSumArray(N)
}

fun createSumArray(N: Int) {
    var sum = 0

    for (i in 0..N) sum += i

    println(sum)
}