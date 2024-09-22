fun main(){
    print("Введите до какого числа находить суммы квадратов: ");
    val final = readln().toInt()

    for(i in 1.. final){
        for(j in 1..final){
            println("сумма квадратов от 1 до $final: ($i * $j)^2 = ${(i*j)*(i*j)}")
        }
    }
}