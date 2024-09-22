fun main() {
    print("Введите число: ")
    val userNum = readln().toInt()
    print("Первые $userNum чисел фиббоначи: ")
    var num1: Int = 1
    var num2: Int = 1
    var sum = 0

    for (i in 1..userNum) {
        println(num1)
        sum = num1 + num2
        num1 = num2
        num2 = sum
    }
}