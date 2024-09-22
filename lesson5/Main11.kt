import java.util.*

fun main() {
    print("Введите первую строку: ")
    val string1 = readln()

    print("Введите вторую строку: ")
    val string2 = readln()

    if (anrm(string1, string2)) {
        println("Анаграммы")
    }
    else {
        println("Не анаграммы")
    }
}

fun anrm(string1: String, string2: String): Boolean {

    val String1 = string1.replace(" ", "").toCharArray().sorted()
    val String2 = string2.replace(" ", "").toCharArray().sorted()

    return String1 == String2
}