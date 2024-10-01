import kotlin.math.pow

fun main() {
    println(
        "КАЛЬКУЛЯТОР" +
                "\nВведите 2 значения: "
    )
    val firstNumber = readln().toDoubleOrNull()
    val secondNumber = readln().toDoubleOrNull()

    if (firstNumber == null || secondNumber == null) {
        println("Ошибка!")
        return
    }

    print("Введите операцию (+, -, *, /, %, <, >, =, ^): ")
    val operation = readln()

    val operationArray = arrayOf("+", "-", "*", "/", "%", "<", ">", "=", "^")

    if (operation == operationArray[0]) {
        println("$firstNumber $operation $secondNumber = ${firstNumber + secondNumber}")
    }
    else if (operation == operationArray[1]) {
        println("$firstNumber $operation $secondNumber = ${firstNumber - secondNumber}")
    }
    else if (operation == operationArray[2]) {
        println("$firstNumber $operation $secondNumber = ${firstNumber * secondNumber}")
    }
    else if (operation == operationArray[3]) {
        println("$firstNumber $operation $secondNumber = ${firstNumber / secondNumber}")
    }
    else if (operation == operationArray[4]) {
        println("$firstNumber $operation $secondNumber = ${firstNumber % secondNumber}")
    }
    else if (operation == operationArray[5]) {
        println("$firstNumber $operation $secondNumber = ${firstNumber < secondNumber}")
    }
    else if (operation == operationArray[6]) {
        println("$firstNumber $operation $secondNumber = ${firstNumber > secondNumber}")
    }
    else if (operation == operationArray[7]) {
        println("$firstNumber $operation $secondNumber = ${firstNumber == secondNumber}")
    }
    else if (operation == operationArray[8]) {
        println("$firstNumber $operation $secondNumber = ${firstNumber.pow(secondNumber)}")
    }
    else {
        println("Ошибка!")
    }
}

