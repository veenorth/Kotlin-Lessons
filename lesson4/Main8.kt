fun main(){
    print("1. Макароны\n2. Картошка жаренная\n3. Рис\n4. Борщ\n5. Селедка под шубой\nВыберите блюдо: ")
    val dish = readln().toInt()

    when(dish){
        1 -> println("\n20 минут")
        2 -> println("\n25 минут")
        3 -> println("\n30 минут")
        4 -> println("\n45 минут")
        5 -> println("\n2 года")

        else -> println("\nОшибка")
    }
}