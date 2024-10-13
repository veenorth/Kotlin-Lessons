fun main() {
    print("Enter text: ")
    val text = readLine()!!.toString()

    vowel(text)
    consonant(text)
}

fun vowel(text: String) {
    val vowelLetter = arrayOf('a', 'e', 'y', 'u', 'i', 'o')
    var num = 0

    for (i in 0..text.length - 1) {
        for (j in 0..vowelLetter.size - 1) if (text[i] == vowelLetter[j]) num++
    }

    println("Vowel letters: $num")
}

fun consonant(text: String) {
    val consonantLetter = arrayOf('q', 'w', 'r', 't', 'p', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v',
        'b', 'n', 'm')
    var num = 0

    for (i in 1..text.length - 1) {
        for (j in 1..consonantLetter.size - 1) if (text[i] == consonantLetter[j]) num++
    }

    println("Consonant letters: $num")
}