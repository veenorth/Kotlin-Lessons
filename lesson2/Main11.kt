fun main() {
    val X = false
    val Y = false
    val Z = true

    print("X или Y и не Z = ")
    println(X or Y and !Z)
    print("X и не Y или Z = ")
    println(X and !Y or Z)
    print("не X и не Y = ")
    println(!X and !Y)
    print("X и (не Y или Z) = ")
    println(X and (!Y or Z))
    print("не (X и Z) или Y = ")
    println(!(X and Z) or Y)
    print("X или (не (Y или Z)) = ")
    println(X or (!(Y or Z)))
}