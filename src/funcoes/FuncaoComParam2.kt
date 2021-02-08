package funcoes

// <E> Tipo Genêrico / Pode ser qualquer conjunto de letras
private fun<E> filtrar(lista: List<E>, filtro: (E) -> Boolean): List<E> {
    val listaFiltrada = ArrayList<E>()
    for (e in lista) {
        if(filtro(e)) {
            listaFiltrada.add(e)
        }
    }

    return listaFiltrada
}

// Método usado como filtro
fun comTresLetras(nome: String): Boolean {
    return nome.length == 3
}

fun main() {
    val nomes = listOf("Matheus", "Ana", "Bia", "Gui", "Rebeca")
    println(filtrar(nomes, ::comTresLetras))
}
