import kotlin.random.Random

fun main(){
    val randomNum = Random.nextInt(1, 100)

    println("Угадай число от 1 до 100")
    println("Введите число")
    val userNum = readln().toInt()

    when{
        (userNum < 1)||(userNum > 100) -> print("Некоректный ввод")
        userNum == randomNum -> println("Верно!")
        else -> println("Неверно")
    }
}