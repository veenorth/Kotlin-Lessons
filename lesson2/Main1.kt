fun main() {
    print("Введите двузначное число: ")

    val number = readln()
    val num: Int = number.toInt()
    val tens = num/10
    val units = num % 10
    val sum = tens + units
    val mult = tens * units

    print("\nЧисло десятков - $tens\nЧисло единиц - $units\nСумма цифр - $sum\nПроизведение цифр - $mult")
}