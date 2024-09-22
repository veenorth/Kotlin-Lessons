fun main() {
    println("Введите номер дня")
    val numDay = readln().toInt()

    when (numDay) {
        1 -> print("Понедельник")
        2 -> print("Вторник")
        3 -> print("Среда")
        4 -> print("Четверг")
        5 -> print("Пятница")
        6 -> print("Суббота")
        7 -> print("Воскресенье")
        else -> {
            print("Ошибка")
        }
    }
}
