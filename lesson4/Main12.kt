fun main(){
    println("Выберите страну:\n1. США\n2. Россия\n3. Япония")
    val a = readln().toInt()
    print("Вы ")

    when (a) {
        1 -> println("американец-ка")
        2 -> println("Русский-кая")
        3 -> println("Японец-ка")

        else -> println("Ошибка")
    }
}