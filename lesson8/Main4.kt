fun main() {
    print("Enter prob: ")
    val prob = readln().toInt()
    print("Enter prize: ")
    val prize = readln().toInt()
    print("Enter pay: ")
    val pay = readln().toInt()

    println(trueOrFalse(prob, prize, pay))
}

fun trueOrFalse(prob: Int, prize: Int, pay: Int): Boolean {
    if (prob * prize > pay) return true
    return false
}