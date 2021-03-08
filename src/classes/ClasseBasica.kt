package classes

class Cliente {
    var nome: String = ""

}

fun main() {
    val cliente = Cliente()

    cliente.nome = "Matheus"

    println("O Cliente é ${cliente.nome}")
}