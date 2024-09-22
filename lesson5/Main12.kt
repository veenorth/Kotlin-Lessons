fun main() {
    print("Введите начальное число: ");
    var first = readln().toInt()

    println("веди шаг числа");
    var steps = readln().toInt()

    for (i in first..first*50 step steps) {
        println(i)
    }
}