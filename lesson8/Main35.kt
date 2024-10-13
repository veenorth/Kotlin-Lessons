fun main() {
    print("Enter natural number: ")
    val naturalNumber = readln().toInt()

    sumNaturalNumber(naturalNumber)
}

fun sumNaturalNumber(natural: Int) {
    var sum = 0

    if (natural > 0) {
        for (i in 0..natural) {
            sum += i
        }
    }
    else return

    println(sum)
}