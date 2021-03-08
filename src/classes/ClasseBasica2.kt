package classes

// () -> parâmetros do construtor
class Pessoa1(var nome: String)
class Pessoa2(val nome: String)
class Pessoa3(nomeInicial: String) {
    var nome: String = nomeInicial
}

fun main() {
    val p1 = Pessoa1("Matheus")
    p1.nome = "João"
    println(p1.nome)

    val p2 = Pessoa2("Maria")
    println(p2.nome)

    val p3 = Pessoa3("Pedro")
    p3.nome = "Ferro"
    println(p3.nome)
}
