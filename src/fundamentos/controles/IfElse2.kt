package fundamentos.controles

fun main() {
    val num1: Int = 6
    val num2: Int = 3

    val maiorValor: Int = if(num1 > num2) {
        println("processando if...")
        num1
    } else {
        println("processando else...")
        num2
    }

    println("O maior valor é $maiorValor")

    for (x in num1.rangeTo(10)) {
        println(x)
    }
}