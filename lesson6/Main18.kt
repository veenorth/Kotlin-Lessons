import kotlin.random.Random

fun main() {
    val intArray = Array(20, { Random.nextInt(1, 100)})
    val group = intArray.toList().chunked(5)

    println(group)
}