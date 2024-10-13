fun main() {
    println("Enter number: ")
    val num = readln().toInt()

    prime(num)
}

fun prime(number: Int) {
    var trueOrFalse = true

    for (i in 2..9) {
        if (number % i == 0) trueOrFalse = false
    }

    if (trueOrFalse || (number == 2 || number == 3 || number == 5 || number == 7)) println("Number $number is prime")
    else println("Number $number isn't prime")
}