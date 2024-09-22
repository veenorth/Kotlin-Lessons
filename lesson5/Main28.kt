fun main() {
    print("Введите границу: ")
    val N = readln().toInt()
    val mass = IntArray(N)

    for (i in 0 until N) {
        println("Введите ${i + 1} число: ")
        mass[i] = readln().toInt()
    }

    mass.sort()
    println("Числа в порядке возрастания - ${mass.joinToString()}")
}