import kotlin.random.Random

fun main() {
    val intArray = Array (20, {Random.nextInt(1, 100)})
    var allNumbers: Double = 0.0

    for (i in 0..intArray.size - 1) {
        allNumbers += intArray[i]
    }

    val arithmeticMean: Double = allNumbers / intArray.size

    println("Среднее арифметическое = $arithmeticMean")
}