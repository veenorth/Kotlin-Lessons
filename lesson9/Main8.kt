import kotlin.random.Random

fun main() {
    print("Game Guess the number\nEnter number: ")
    var userNumber = readln().toInt()
    val randomNumber = (1..100).random()
    var moreOrLess = false

    while (!moreOrLess) {
        if (userNumber == randomNumber) moreOrLess = true
        else {
            guessNumber(userNumber, randomNumber)
            userNumber = readln().toInt()
        }
    }

    if (moreOrLess) println("You win!")
}

fun guessNumber(userNum: Int, randomNum: Int) {
    if (userNum > randomNum) println("Your number > random number")
    if (userNum < randomNum) println("Your number < random number")
}