import kotlin.math.pow

fun main() {
    println("Enter n:")
    val n = readln().toDouble()
    println("Enter k")
    val k = readln().toDouble()

    println(square(n, k))
}

fun square(n: Double, k: Double): Boolean {
    if (k.pow(k) == n) return true
    return false
}