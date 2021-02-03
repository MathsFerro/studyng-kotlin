package fundamentos

fun main() {
    // ? -> Variável Opcional, pode ter um valor null / não ter valor
    var a: Int? = null // safe call operator
    println(a?.dec())

}