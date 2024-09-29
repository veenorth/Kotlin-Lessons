fun main() {
    val firstNumber = 1
    val step = 5
    val repeat = 20
    val progression = Array(repeat) { i -> firstNumber + i * step }

    println(progression.joinToString(" "))
}