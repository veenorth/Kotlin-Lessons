fun main(){
    print("Введите границу: ")
    val first = readln().toInt()
    var sumEven = 0
    var sumnOdd = 0

    for(i in 1..first){
        if(i%2 == 0){
            sumEven += i
        }
        else{
            sumnOdd +=i
        }
    }

    println("Сумма четных: $sumEven")
    println("Сумма нечетных: $sumnOdd")
}