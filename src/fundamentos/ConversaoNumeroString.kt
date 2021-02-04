package fundamentos

fun main() {
    val a: Int = 1

    // Número para String
    println(a.toString() + 1)

    // String para Número
    println("1.9".toDouble() + 3)

    println("Teste".toIntOrNull()) // Se não conseguir converter para número, retornar o null
    println("Teste".toIntOrNull() ?: 0)

    println("1".toInt() + 3)
}