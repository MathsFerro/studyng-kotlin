package funcoes

private fun imprimeMaior1(a: Int, b: Int) {
    println(Math.max(a, b))
}

// Não precisa fazer isso.
private fun imprimeMaior2(a: Int, b: Int): Unit {
    println(Math.max(a, b))
}

private fun imprimeMaior3(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return
}

private fun imprimeMaior4(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return Unit
}

private fun imprimeMaior5(a: Int, b: Int) {
    println(Math.max(a, b))
    return
}

fun main() {
    imprimeMaior1(2,1)
    imprimeMaior2(2,1)
    imprimeMaior3(2,1)
    imprimeMaior4(2,1)
    imprimeMaior5(2,1).run { 2 > 1 }.run { print("Resultado = $this") }
}