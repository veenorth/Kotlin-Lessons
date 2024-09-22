fun main() {
    println("Выберите кровь:\n1. А\n2. В\n3. АВ\n4. O")
    val blood = readln().toInt()

    when (blood) {
        1 -> println("Можно использовать: A, O.")
        2 -> println("Можно использовать: B, O.")
        3 -> println("Можно использовать: A, B, AB, O.")
        4 -> println("Можно использовать: O.")
        else -> println("Ошибка")
    }
}