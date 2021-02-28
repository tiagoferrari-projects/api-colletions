package one.digitalinnovation.collection

fun main() {
    val nomes = Array(4){""}
    val separador = "------------------"

    nomes[0] = "Tiago"
    nomes[1] = "Angela"
    nomes[2] = "Alice"
    nomes[3] = "Antônio"

    for(nome in nomes){
        println(nome)
    }
    println(separador)

    nomes.sort()
    nomes.forEach { println(it) }

    println(separador)

    val nomes2 = arrayOf("Tiago", "Antônio", "Angela", "Alice")
    nomes.sort()
    nomes.forEach { println(it) }

}