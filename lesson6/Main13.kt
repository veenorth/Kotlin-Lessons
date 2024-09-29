import kotlin.random.Random

fun main() {
    val intArray = Array(20, { Random.nextInt(1, 100)})
    println(intArray.joinToString())
}