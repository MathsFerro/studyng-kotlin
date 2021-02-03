package fundamentos.controles

// Não recomendado!!
fun main() {

    for (i in 1..10) {
        if (i==5){
            break // Quebrar o bloco que está associado ( nesse caso é o for )
        }

        println("Atual $i")
    }

    println("Fim!")

}