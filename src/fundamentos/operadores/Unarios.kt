package fundamentos.operadores

fun main() {
    var n1: Int = 1
    var n2: Int = 2

    n1++ // pós-fixada
    println(n1)

    --n1 // pré-fixada
    println(n1)

    // Incremento e decremento
    println(++n1 == n2--) // n1 (2) somado antes da comparação, n2 (2) decrementado depois da comparação

    println(n1 == n2)
}