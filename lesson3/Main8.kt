fun main() {
    println("Введите 2 числа - первое в км, второе в футах:")
    val km = readln().toDouble()
    val fut = readln().toDouble()
    val kmFut = fut * 0.305
    if (km < kmFut) {
        println("$km км < $fut ф")
    }
    else if (kmFut < km) {
        println("$fut ф < $km км")
    }
}