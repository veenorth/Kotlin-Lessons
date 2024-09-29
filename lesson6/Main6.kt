fun main() {
    val allNumberArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val chetNumberArray = mutableListOf<Int>()
    val nechetNumberArray = mutableListOf<Int>()

    for(i in 0..allNumberArray.size - 1){
        if(allNumberArray[i] % 2 == 0){
            chetNumberArray.add(allNumberArray[i])
        }
        else{
            nechetNumberArray.add(allNumberArray[i])
        }
    }

    println("Четные числа: ${chetNumberArray.joinToString()}}")
    println("Нечетные числа: ${nechetNumberArray.joinToString()}}")
}