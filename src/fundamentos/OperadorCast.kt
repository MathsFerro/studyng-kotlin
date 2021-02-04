package fundamentos

private fun imprimirConceito(nota: Any) {
    // when(nota as? Int){} Cast opcional // Cast seguro
    when(nota as? Int) { // Quero utilizar ela como Inteiro // as -> obrigatorio o tipo // as? -> Cast seguro // when(nota as? Int ?: 10) -> atribuir 10 se vier null
        // Já posso trabalhar com nota do tipo Int
        10, 9 -> println("A")
        8, 7 -> println("B")
        6, 5 -> println("C")
        4, 3 -> println("D")
        2, 1, 0 -> println("E")
        else -> println("Nota inválida")
    }
}

fun main() {
    val notas = arrayOf(9.6, 3.8, 7.2, 5.5, 4.1)
    for (nota in notas) {
        imprimirConceito(nota.toInt())
    }
}

