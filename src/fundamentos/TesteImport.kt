package fundamentos

import fundamentos.pacoteA.simplesFuncao as funcaoSimples
import fundamentos.pacoteA.Coisa
import fundamentos.pacoteA.FaceMoeda.CARA
import fundamentos.pacoteB.*

fun main() {
    // kotlin.io é o import padrão disponível em todos arquivo kotlin
    kotlin.io.println(funcaoSimples("ok"))

    val coisa = Coisa("Bola")
    println(coisa.nome)

    println(CARA)

    println("${soma(2, 3)} e ${subtracao(4, 6)}")
}