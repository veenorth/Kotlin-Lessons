fun main() {
    print("Введите натуральное число: ")
    val num = readln().toInt()

    if (num % 2 == 0) {
        println("\nЧисло четное")
    }
    if (num % 10 == 7) {
        println("Число оканчивается цифрой 7")
    }
}