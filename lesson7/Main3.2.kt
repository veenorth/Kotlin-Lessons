fun main() {
    print("Введите список чисел: ")
    val intArray = readLine()!!.split(" ").min()
    println("Минимальное число в списке $intArray")
}