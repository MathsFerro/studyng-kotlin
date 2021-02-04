package fundamentos.operadores

private fun obterResultado(nota: Double): String = if(nota>=7) "Passou" else "Reprovou"

fun main() {
    println(obterResultado(9.3))
}