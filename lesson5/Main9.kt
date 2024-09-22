fun main() {
    print("Введите строку: ")
    val string = readln()
    if (string != null) {
        val reversString = string.reversed()
        println("Строка в обратном порядке: $reversString")
    } else {
        println("Ошибка")
    }
}