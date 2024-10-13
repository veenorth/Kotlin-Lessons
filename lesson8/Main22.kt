fun main() {
    print("Enter number: ")
    val num = readln()

    palindrome(num)
}

fun palindrome(number: String) {
    if (number.reversed() == number) println("Number $number is palindrome")
    else println("Number $number isn't palindrome")
}