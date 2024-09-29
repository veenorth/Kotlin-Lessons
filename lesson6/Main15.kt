fun main() {
    val intArray = arrayOf(0, 1, 2, 3, 3, 2, 1, 0)
    val intArrayReverse = intArray.reversedArray()
    var palindrome = 0

    for (i in 0..intArray.size - 1) {
        if (intArray[i] == intArrayReverse[i]) {
            palindrome++
        }
    }

    if (palindrome == intArray.size) {
        println("Данный массив палиндром")
    }
    else {
        println("Этот массив не палиндром")
    }
}

