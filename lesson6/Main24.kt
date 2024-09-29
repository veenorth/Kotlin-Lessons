fun main(){
    val intMatrix = arrayOf(
        arrayOf(6, 6, 6),
        arrayOf(9, 9, 9),
        arrayOf(5, 5, 5)
    )
    val transposition = Array(intMatrix[0].size) { IntArray(intMatrix.size) }

    for (i in intMatrix.indices) {
        for (j in intMatrix[i].indices) {
            transposition[j][i] = intMatrix[i][j]
        }
    }

    println("Транспонированная матрица:")
    
    for (i in transposition) {
        println(i.joinToString(" "))
    }
}