fun main() {
    print("Enter number: ")
    val number = readln().toInt()
    reverse(number)
}

fun reverse(number: Int) {
    val intArray = arrayOfNulls<Int>(number + 1)
    if (number != 0) {
        for (i in 0..number) intArray[i] = i
        print("[${intArray.reversedArray().joinToString()}]")
    }
    else println("[]")
}