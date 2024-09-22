fun main() {
    print("Введите трехзначное число: ")

    val number = readln()
    val num: Int = number.toInt()
    val hund = num/100
    val tens = num/10%10
    val units = num % 10

    val sum = tens + units + hund
    val mult = tens * units * hund

    print("\nЧисло десятков - $tens\nЧисло единиц - $units\nСумма цифр - $sum\nПроизведение цифр - $mult")
}