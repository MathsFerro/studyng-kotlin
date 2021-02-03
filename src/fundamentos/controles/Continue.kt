package fundamentos.controles

fun main() {
    for(i in 1..10) {
        if(i==5)
            continue // Vai para o próximo laço da repetição

        println("Atual: $i")
    }
}