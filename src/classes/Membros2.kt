package classes

class Calculadora {
    private var resultado: Int = 0

    // Com o Retorno no mesmo nome do Objeto, podemos encadear a função ( Ex: no main lá embaixo )
    fun somar(vararg valores: Int): Calculadora {
        valores.forEach { resultado += it }
        return this
    }

    fun multiplicar(valor: Int): Calculadora {
        resultado *= valor
        return this
    }

    fun limpar(): Calculadora {
        resultado = 0
        return this
    }

    fun print(): Calculadora {
        println(resultado)
        return this
    }

    fun obterResultado(): Int {
        return resultado
    }
}

fun main() {
    val calc = Calculadora() // Instanciando Objeto
    calc.somar(1,2,3).multiplicar(3).print()
    calc.somar(7, 10).print().limpar()
    println(calc.obterResultado())
}
