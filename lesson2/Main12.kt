fun main() {
    val A = true
    val B = false
    val C = false

    print("А или не (А и В) или С = ")
    println(A or !(A and B) or C)
    print("не А или А и (В или С) = ")
    println(!A or A and (B or C))
    print("(А или В и не С) и С = ")
    println((A or B and !C) and C)
}