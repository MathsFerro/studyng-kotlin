package classes

val diretamenteNoArquivo = "Bom dia"

fun topLevel() {
    val local = "Fulano!"
    println("$diretamenteNoArquivo $local")
}

// Variável de Instancia: Pertence a um objeto
// Variável de Classes: Compartilhadas por todos objetos, um único valor
class Coisa {
    var variavelDeInstancia: String = "Boa Noite"

    // Objeto Singleton associado a essa classe ( Objeto companheiro )
    companion object {
        @JvmStatic val constanteDeClasse = "Ciclano" // Membro estático
    }

    fun fazer() {
        val local: Int = 7

        if(local>3) {
            val variavelDeBloco = "Beltrano"
            println("$variavelDeInstancia, $variavelDeBloco, $local, $diretamenteNoArquivo")
        }
    }

}

fun main() {
    topLevel()
    Coisa().fazer()

    println(Coisa.constanteDeClasse)
}