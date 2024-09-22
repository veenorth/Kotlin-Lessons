fun main() {
    print("Введите число: ")
    val N = readln().toInt()
    var num = 0

    for (i in 1..N+1) {
        println(num)
        num += i
    }
}