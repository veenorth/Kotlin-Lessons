fun main(){
    println("Выберите способ оплаты: \n1. Наличные\n2. Кредитная карта\n3. PayPal")
    val pay = readln().toInt()

    when(pay){
        1 -> println("Ближайший адрес - ул.Трудовая 10")
        2 -> println("Выберите банк")
        3 -> println("Введите данные")
        
        else -> println("Ошибка")
    }
}