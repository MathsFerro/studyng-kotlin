package fundamentos.controles

fun main() {
    val nota: Double = 4.2

    val resultado = if(nota>=6.0) {
        "Aprovado"
    } else {
        "Reprovado"
    }

    println(resultado)
}