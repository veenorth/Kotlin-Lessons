import kotlin.random.Random

fun main(){
    val randomNum = Random.nextInt(1, 20)

    println("Угадай число от 1 до 20")
    println("Введите число")
    val userNum = readln().toInt()

    when{
        (userNum < 1)||(userNum > 20) -> print("Некоректный ввод")
        userNum == randomNum -> println("Верно!")
        else -> println("Неверно")
    }
}