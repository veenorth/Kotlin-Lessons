import kotlin.random.Random

fun main() {
    print("Enter length password: ")
    val length = readln().toInt()

    val chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!?,.<>'-=+/|:;@#$%^&*()".toCharArray()
    val password = StringBuilder()
    for (i in 0..length) {
        val randomIndex = Random.nextInt(chars.size)
        password.append(chars[randomIndex])
    }

    println(password)
}