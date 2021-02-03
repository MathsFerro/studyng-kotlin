package fundamentos.controles

fun main() {
    val alunos = arrayListOf<String>("Matheus", "Marcos", "Ferro")

    for((index, aluno) in alunos.withIndex()) { // For com indice
        println("indice: $index e aluno: $aluno")
    }
}