import kotlin.random.Random

fun main() {
    val intArray1 = Array(20, { Random.nextInt(1, 100)})
    val intArray2 = Array(20, { Random.nextInt(1, 100)})
    val intArray3 = Array(20, { Random.nextInt(1, 100)})
    val intArray4 = Array(20, { Random.nextInt(1, 100)})
    val intArray5 = Array(20, { Random.nextInt(1, 100)})

    val intArrayFinal = arrayOf(*intArray1, *intArray2, *intArray3, *intArray4, *intArray5)
    println(intArrayFinal.joinToString())
}