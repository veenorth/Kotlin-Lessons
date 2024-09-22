fun main(){
    println("Выберите ошибку:\n1. 100\n2. 200\n3. 300")
    val error = readln().toInt()
    when (error) {
        1 -> println("Неверный пароль")
        2 -> println("Неверный запрос")
        3 -> println("Неверный логин")

        else -> println("Ошибка")
    }
}