package fundamentos.controles

fun main() {
    var opcao: Int = -1

    // Executa pelo menos 1x mesmo se a condição estiver false.
    do {
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("Você escolheu a opção: $opcao")
    } while (opcao!=-1)

    println("Xau, até a próxima")
}