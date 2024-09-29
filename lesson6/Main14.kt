import kotlin.random.Random

fun main() {
    val intArray = Array(20, { Random.nextInt(1, 100)})

    for (i in 0..intArray.size - 1) {
        if (intArray[i] % 3 == 0) {
            println(intArray[i])
        }
    }
}