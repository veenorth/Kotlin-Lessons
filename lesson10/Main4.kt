fun main() {
    print("Enter number: ")
    val num = readln().toInt()

    fizllBizllVizzl(num)
}

fun fizllBizllVizzl(number: Int) {
    print("[")

    for (i in 1..number) {
        if (i % 3 == 0 && i % 5 == 0) print("VizzlBizzl, ")
        else if (i % 3 == 0) print("Fizzl, ")
        else if (i % 5 == 0) print("Bizzl, ")
        else print("$i, ")
    }
    print("]")
}