package fundamentos.operadores

data class Carro(
    val marca: String,
    val modelo: String
)

// Desestruturar
fun main() {
    val ( marca, modelo ) = Carro("Ford", "Fusion") // Desestruturando
    println("$marca e $modelo")

    val ( a, b ) = Carro("Ford", "Fusion")
    println("$a e $b")

    val ( marido, mulher ) = listOf("João", "Maria")
    println("$marido e $mulher")

    // _ -> ignora o elemento
    val (_, _, terceiroLugar) = listOf("Kimi", "Hamilton", "Alonso")
    println("$terceiroLugar ficou em terceiro lugar.")
}