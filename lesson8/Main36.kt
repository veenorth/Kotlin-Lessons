fun main() {
    print("Enter string: ")
    val string = readLine()!!.toString()
    print("Enter substring: ")
    val subString = readLine()!!.toString()

    subStringCheck(string, subString)
}

fun subStringCheck(string: String, subString: String) = println(string.contains(subString))