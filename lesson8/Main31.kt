fun main() {
    print("Enter temperature Celsius: ")
    val celsius = readln().toDouble()

    celsiusToFahrenheit(celsius)
}

fun celsiusToFahrenheit(celsius: Double) {
    val fahrenheit = celsius * 1.8 + 32
    println(String.format("%.2f", fahrenheit))
}