fun main() {
    val intArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Поиск: ")
    val poisk = readln().toInt()
    var num = -1

    for (i in 0..intArray.size - 1) {
        if (poisk == intArray[i]) {
            num = i
        }
    }

    if (num != -1) {
        println("Элемент найден - [$num]")
    }
    else {
        println("Элемент не найден")
    }
}