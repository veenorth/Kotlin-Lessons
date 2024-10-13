fun main() {
    print("Enter number: ")
    val number = readln().toInt()
    println("pyramid($number)")

    pyramid(number)
}

fun pyramid(number: Int) {
    for (i in 1..number) {
        for (j in 1..number - i) print(" ")
        for (l in 1..i) print("# ")
        println()
    }
}