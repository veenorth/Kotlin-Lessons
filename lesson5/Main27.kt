fun main() {
    print("Введите границу: ")
    val N = readln().toInt()

    for(i in 1..N){
        for(j in 1..i ){
            print(j)
        }
        print("\n")
    }
}