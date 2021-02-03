package fundamentos.controles

// NÂO UTILIZAR O BREAK ROTULADO! NÃO RECOMENDADO!
fun main() {
    externo@for(i in 1..15) {
        for(j in 1..15) {
            if(i==2 && j == 9) break@externo

            println("i $i j $j")
        }
    }
    println("Fim")
}