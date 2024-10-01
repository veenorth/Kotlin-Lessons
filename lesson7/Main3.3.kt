fun main() {
    print("Введите 2 числа: ")
    val intArray = readLine()!!.split(" ")

    for (i in 0..intArray.size) {
        if (i > 2) {
            println("Введите 2 числа!")
            return
        }
    }
    println(intArray[0] == intArray[1])
}