package funcoes

class Produto(
    val nome: String,
    val preco: Double
)

infix fun Produto.maisCaroQue(produto: Produto): Boolean = this.preco > produto.preco

fun main() {
    val p1 = Produto("Ipad", 2349.00)
    val p2 = Produto(preco = 3.49, nome = "Borracha")

    println(p1 maisCaroQue p2) // infix está no meio dos 2 operandos, tipo 1 + 1 no caso o + é o infix
    println(p2.maisCaroQue(p1)) // também pode ser assim
}