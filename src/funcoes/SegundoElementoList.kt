package funcoes

// Generic
fun<E> List<E>.secondOrNull(): E? = if(this.size>2) this.get(1) else null
// o "E" pode ser qualquer nome

fun List<Int>.thirdOrNull(): Int? {
    return if(this.size>=3) this.get(2) else null
}

// Por padrão a lista é Heterogenea -> Adicionar tipo diferentes na mesma lista
// Generics -> Tipos dos elementos EX: List<String>

fun main() {
    val list = listOf("Matheus", "João", "Maria")
    println(list.secondOrNull())

    val listNumeros = listOf(1, 2, 3)
    println(listNumeros.thirdOrNull())
}