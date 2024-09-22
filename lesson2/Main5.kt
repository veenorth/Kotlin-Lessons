import kotlin.math.sqrt

fun main() {
    print("Введите число, корень которого необходимо вывести: ")

    val num = readln().toDouble()

    print("Корень числа $num = ")
    print(sqrt(num))
}