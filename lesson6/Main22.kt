import kotlin.random.Random

fun main() {
    val intArray = Array(20, { Random.nextInt(1, 100) })
    println(intArray.joinToString())

    var last = 0
    var penultimate = 0

    for (num in intArray) {
        if (num > last) {
            penultimate = last
            last = num
        } else if (num > penultimate && num != last) {
            penultimate = num
        }
    }

    println(penultimate)
}

