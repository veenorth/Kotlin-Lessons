fun main() {
    println("Enter text:")
    val txt = readln()
    println("Enter quantity:")
    val num = readln().toInt()

    recursive(txt, num)
}

fun recursive(txt: String, num: Int) {
    for (i in 0..num - 1) {
        print(txt)
    }
}