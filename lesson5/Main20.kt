fun main() {

    println("Введите границы: ")
    var num1 = readln().toInt()
    val num2 = readln().toInt()

    while (num1 < num2) {
        if (proof(num1)) {
            println("$num1")
        }
        num1++
    }
}
fun proof(a: Int): Boolean {
    for(i in 2..a-1 ){
        if(a % i == 0){
            return false
        }
    }
    return true
}