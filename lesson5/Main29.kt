fun main() {
    print("Введите число: ")
    val N = readln().toInt()
    val sum = (1..N).sumOf { 1.0 / it }
    println("Сумма = $sum")
}