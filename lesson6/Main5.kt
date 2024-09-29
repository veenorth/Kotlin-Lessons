import kotlin.enums.enumEntries

fun main() {
    val strArray = arrayOf("QWE", "qwe", "EWQ", 4, "ewq")

    for (i in 0..strArray.size - 1) {
        when(strArray[i]){
            is Int -> println("Уникальный символ: ${strArray[i]}")
        }
    }

}