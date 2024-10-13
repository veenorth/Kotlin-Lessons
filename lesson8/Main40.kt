fun main() {
    print("Enter array: ")
    val array = readLine()!!.toMutableList()

    copyArray(array)
}

fun copyArray(array: MutableList<Char>) {
    val arrayCopy = array.filter { !it.isWhitespace() }
    println(arrayCopy)
}