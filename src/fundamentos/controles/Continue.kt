package fundamentos.controles

// Evitar o uso
fun main() {
    for(i in 1..10) {
        if(i==5)
            continue // Vai para o próximo laço da repetição ( Pula )

        println("Atual: $i")
    }
}