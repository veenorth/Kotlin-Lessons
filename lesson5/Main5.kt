fun main(){
    print("Введите число: ")
    val userNum = readln().toInt()
    var num = 0

    for (i in 2..9) {
        if (userNum % i != 0 && userNum % userNum == 0) {
            num++
        }
        else if (userNum % i == 0) {
            println("Ошибка")
            return
        }
        if (num > 0 || userNum == 2 || userNum == 3 || userNum == 5 || userNum == 7) {
            println("Число простое")
            return
        }
    }

}