package fundamentos.operadores

import java.time.LocalDateTime
import java.util.*

fun main() {
    println("Banana" === "Banana") // === Igualdade Estrita -> Compara o Tipo também
    println(3 !== 2)
    println(3 < 2)
    println(3 > 2)
    println(3 <= 2)
    println(3 >= 2)

    val d1 = Date(0) //
    val d2 = Date(0) // Criando instância e atribuindo para d2

    // Igualdade referencial
    println("Resultado com '===' ${d1 === d2}") // Endereços alocados na memória diferente

    // Igualdade estrutural
    println("Resultado com '==' ${d1 == d2}") // Conteúdo das 2 datas são iguais
    //println("Resultado com '==' ${d1.equals(d2)}")
}