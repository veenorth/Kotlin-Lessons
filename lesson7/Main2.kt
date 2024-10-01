fun main() {
    print("Введите слово: ")
    val word = readln().decapitalize()

    if (word == word.reversed())
        println("Слово $word - палиндром")
    else
        println("Слово $word - не палиндром")
}