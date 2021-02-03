package fundamentos

fun main() {
    val opcional: String? = null

    // Trazer um valor padrão quando tentamos atribuir algo que possa vir com valor null
    val obrigatorio: String = opcional ?: "Valor padrão" // Caso esteja null, a val obrigatorio pegara o "Valor padrão"

    println(obrigatorio)
}