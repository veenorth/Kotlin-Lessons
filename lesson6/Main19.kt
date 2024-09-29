import kotlin.random.Random

fun main() {
    val intArraySorted1 = Array(20, { Random.nextInt(1, 100)})
    intArraySorted1.sort()
    val intArraySorted2 = Array(20, { Random.nextInt(1, 100)})
    intArraySorted2.sort()

    val intArraySortedFinal = arrayOf(*intArraySorted1, *intArraySorted2)
    println(intArraySortedFinal.joinToString())
}