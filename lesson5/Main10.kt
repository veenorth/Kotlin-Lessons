fun main(){
    print("Введите число: ")
    var num1 = readln().toInt()
    var sum = 0

    while (num1 != 0) {
        sum += num1 % 10
        num1 /= 10
    }
    println("Сумма цифр вашего числа это $sum")
}