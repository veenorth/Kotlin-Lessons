fun main(){
    println("Введите два числа:")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    var a = num1
    var b = num2
    var num3 = b

    while(b!=0){
        num3 = b
        b = a % b
        a = num3
    }
    println("НОД чисел $num1 и $num2 = $a ")
}