fun main() {
    print("Введите название команды: ")
    val team = readln()
    print("Введите количество побед: ")
    val win = readln().toInt()
    print("Введите количество ничейных: ")
    val draw = readln().toInt()
    print("Введите количество поражений: ")
    val lose = readln().toInt()

    val result = (win * 3) + draw

    println("У команды $team $result очков!")
}