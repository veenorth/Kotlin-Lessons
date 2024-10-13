fun main() {
    print("Convert rubles to dollars\nEnter rubles: ")
    val rubles = readln().toInt()
    print("Enter dollar exchange rate: ")
    val dollarRate = readln().toInt()

    println("$rubles rubles = ${rubles * dollarRate} dollars")
}