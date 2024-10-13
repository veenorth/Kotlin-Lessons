import kotlin.random.Random

fun main() {
    val randomArray = Array(10) {Random.nextInt(1, 100)}.joinToString()
    println(randomArray)
}