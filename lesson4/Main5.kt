fun main(){
    print("Введите цифру: ")
    val a = readln().toInt()

    when {
        a > 0 -> print("Число положительное")
        a < 0 -> print("Число отрицательное")
        else -> print("Ноль")
    }
}