fun main() {
    print("Enter number: ")
    val number = readln().toInt()

    multiplicationTable(number)
}

fun multiplicationTable(number: Int) {
    var multiplication = 0

    for (i in 1..10) {
        multiplication = number * i
        println(multiplication)
    }
}