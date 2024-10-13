fun main() {
    println("Enter FPS:")
    val FPS = readln().toInt()
    println("Enter minutes:")
    val minutes = readln().toInt()

    fpsInUserMinutes(FPS, minutes)
}

fun fpsInUserMinutes(FPS: Int, minutes: Int) {
    return println(minutes * 60 * FPS)
}