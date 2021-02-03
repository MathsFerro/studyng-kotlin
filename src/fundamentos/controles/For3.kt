package fundamentos.controles

fun main() {
    for (i in 0..100 step 5) { // step 5 -> 5 em 5
        println(i)
    }

    for(i in 95 downTo 0 step 5) {
        println(i)
    }
}