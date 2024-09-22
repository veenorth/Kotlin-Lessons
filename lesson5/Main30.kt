fun main() {
    println("Введите целое число:")
    val numDecimal = readln().toInt()
    val numBinary = Integer.toBinaryString(numDecimal)
    println("в двоичной системе: $numBinary")
}