fun main() {
    print("Введите сначала число, а потом степень: ")

    val num = readln().toInt()
    val degree = readln().toInt()
    var mult = 1

    for(i in 1..degree) {
        mult *= num
    }

    print("\n$num в степенм $degree = $mult")
}