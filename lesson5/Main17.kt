fun main(){
    println("Введите: ")
    val stringAndChar = readLine()

    for (i in 0..stringAndChar!!.length - 1 ){
        println(stringAndChar[i])
    }
}