package funcoes

// Argumentos variáveis
private fun ordernar(vararg numeros: Int, a: Int): IntArray {
    return numeros.sortedArray() // Ordenação
}

fun main() {
    for (n in ordernar(38, 3, 456, 8, 51, 1, 88, 73, a=99)) {
        print("$n ")
    }
}