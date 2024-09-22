fun main() {
    print("Введите: ")
    val string1 = readLine().toString()
    val string2 = string1.reversed()

    if(string2 == string1){
        println("Палиндром")
    }
    else{
        println("Не палиндром")
    }
}