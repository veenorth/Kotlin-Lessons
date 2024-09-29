import kotlin.random.Random

fun main() {
    val intArray = Array (20, {Random.nextInt(1, 100)})
    println(intArray.joinToString())
    print("Введите число для поиска: ")
    val search = readln().toInt()
    var provided = false

    if(search in intArray){
        provided = true
    }
    else {
        provided = false
    }

    println("Вывод: $provided")

}