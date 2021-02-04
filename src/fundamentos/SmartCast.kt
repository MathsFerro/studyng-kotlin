package fundamentos

private fun tipoVariavel(x: Any) {
    if(x is String) {
        println(x.toUpperCase())
    } else if(x is Int) { // Os metodos vem porque estamos fazendo a checagem do tipo na linha 4 e 6
        println(x.plus(3))
    }
}

private fun tipoVariavel2(x: Any) {
    when(x) { // Entra somente em uma única seleção e sai
        is String -> println(x.toUpperCase())
        is Int -> println(x.plus(3))
        else -> println("Repense a sua variável!")
    }
}

fun main() {
    tipoVariavel2(1)
    tipoVariavel2(true)
}