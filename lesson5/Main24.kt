fun main(){
    val matrix = arrayOf(
        arrayOf(1, 1, 1),
        arrayOf(3, 3, 3),
        arrayOf(5, 5, 5)
    )

    val transposed = Array(matrix[0].size) { IntArray(matrix.size) }

    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            transposed[j][i] = matrix[i][j]
        }
    }

    println("Транспонированная матрица:")

    for (row in transposed) {
        println(row.joinToString(" "))
    }
}