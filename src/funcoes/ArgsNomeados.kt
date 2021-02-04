package funcoes

private fun relacaoTrabalho(chefe: String, funcionario: String): String {
    return "$funcionario é subordinado(a) à $chefe"
}

fun main() {
    println(relacaoTrabalho("João", "Maria"))
    println(relacaoTrabalho(funcionario = "João", chefe = "Maria"))
}