package fundamentos

fun main() {
    val valor: Any = 123

    if(valor is String) {
        println(valor)
    } else if (valor !is String){ // Negação do is
        println("Não é uma String")
    }
}