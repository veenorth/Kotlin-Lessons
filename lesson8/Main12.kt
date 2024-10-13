fun main() {
    print("Enter number: ")
    val number = readln().toInt()

    google(number)
}

fun google(number: Int) {
    println("G${"o".repeat(number)}gle")
}