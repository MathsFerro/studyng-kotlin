package funcoes

inline fun transacao(funcao: () -> Unit, a: Int) {
    println("Abrindo transação...")
    try {
        funcao()
    } finally { // Vai cair aqui se der erro ou se for bem sucedida a operação
        println("Fechando a transação...")
    }
}

fun main() {
    /*transacao {
        println("Executando SQL 1...")
        println("Executando SQL 2...")
        println("Executando SQL 3...")
    } // Sem o parametro "a: Int" */

    transacao({
        println("Executando SQL 1...")
        println("Executando SQL 2...")
        println("Executando SQL 3...")
    }, 21) // Com parametro "a: Int"
}