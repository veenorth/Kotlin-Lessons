import kotlin.random.Random

fun main() {
    val intArray = Array(100, { Random.nextInt(1, 100)})
    val group = intArray.toList().chunked(10)

    for (i in 0..9) {
        println(group[i])
    }
}