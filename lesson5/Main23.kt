fun main() {
    var game = true
    var stop = ""

    while(game){
        print("Введите первое число: ")
        val num1 = readln().toInt()
        print("Введите второе число: ")
        val num2 = readln().toInt()

        println("$num1 * $num2 = ${num1*num2}")
        println("$num1 + $num2 = ${num1+num2}")
        println("Продолжить?\nДа - Enter\nНет - Стоп\n")
        stop = readln()

        if(stop == "Стоп"){
            game = false
        }
    }
}