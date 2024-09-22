fun main(){
    println("Введите оценку")
    val estimation = readln().toInt()

    when (estimation) {
        1 -> print("Кол")
        2 -> print("Два")
        3 -> print("Три")
        4 -> print("Четыре")
        5 -> print("Пять")
        else -> {
            print("неведомая оценка")
        }
    }

}