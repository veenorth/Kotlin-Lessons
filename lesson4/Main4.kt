fun main() {
    println("Введите Ч.М.С:")
    val hour = readln().toInt()
    val minut = readln().toInt()
    val second = readln().toInt()

    when {
        (hour in 6..10 && minut in 0..59 && second in 0..59) -> println("Утро")
        (hour in 11..17 && minut in 0..59 && second in 0..59) -> println("День")
        (hour in 18..22 && minut in 0..59 && second in 0..59) -> println("Вечер")
        (hour in 22..24 || hour in 0..5 && minut in 0..59 && second in 0..59) -> println("Ночь")
        else -> println("Данные введены неверно")
    }
}