package fundamentos.controles

fun main() {
    val nota = 10 // Inferência -> Quando não colocamos o tipo na variável, porém vai assumir o tipo Int

    when(nota) {
        10, 9 -> println("Fantástico")
        8, 7 -> println("Parabéns")
        6, 5, 4 -> println("Tem como recuperar")
        in 0..3 -> println("Te vejo no próximo semestre")
        else -> println("Nota inválida")
    }
}