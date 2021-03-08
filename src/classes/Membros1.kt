package classes

class Data(var dia: Int, var mes: Int, var ano: Int) {
    fun formatar(): String {
        return "$dia/$mes/$ano"
    }
}

fun main() {
    val nascimento = Data(12, 4, 1999)
    println(nascimento.formatar())

    with(nascimento) { println("$ano/$mes/$dia") }

    nascimento.mes = 12
    println(nascimento.formatar())
}