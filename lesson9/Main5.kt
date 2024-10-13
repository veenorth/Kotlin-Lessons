fun main() {
    print("Enter num: ")
    val num = readln().toInt()

    for (i in 1..num) {
        if (prime(i)) println(i)
    }
}
fun prime(num: Int): Boolean {
    var i = 3

    if (num <= 1) return false
    if (num == 2) return true
    if (num % 2 == 0) return false

    while (i * i <= num) {
        if (num % i == 0) return false
        i += 2
    }

    return true
}