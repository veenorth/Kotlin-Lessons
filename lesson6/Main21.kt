fun main(){
    val intArray = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(intArray.joinToString())
    println("Введите индекс элемента который хотите удалить")

    val delete = readln().toInt()
    intArray.removeAt(delete)
    println(intArray.joinToString())
}