fun main() {
    print("Enter text: ")
    val text = readLine()!!.toString()

    println("Vowels = ${vowelInString(text)}")
}

fun vowelInString(string: String): Int {
    val arrayVowel = arrayOf('a', 'e', 'y', 'u', 'i', 'o')
    var num = 0

    for (i in 0..string.length - 1) {
        for (j in 0..arrayVowel.size - 1) {
            if (string[i] == arrayVowel[j]) num++
        }
    }

    return num
}