package funcoes

class Produto(
    val nome: String,
    val preco: Double
)

infix fun Produto.maisCaroQue(produto: Produto): Boolean = this.preco > produto.preco


data class Teste(
    var name: String = "",
    var activated: Boolean = false
)

fun main() {
    val p1 = Produto("Ipad", 2349.00)
    val p2 = Produto(preco = 3.49, nome = "Borracha")

    println(p1 maisCaroQue p2) // infix está no meio dos 2 operandos, tipo 1 + 1 no caso o + é o infix
    println(p2.maisCaroQue(p1)) // também pode ser assim

    val list = listOf(Teste("Eleven", false), Teste("Prime", true))
    val active: Teste = list.first {
        it.activated
    }

    if(!active.name.contains("lvn")) {
        println("Olá mundo :D")
    }



}