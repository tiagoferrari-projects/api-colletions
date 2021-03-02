package one.digitalinnovation.collection

fun main() {
    val pair: Pair<String,Double> = Pair("Joao", 12500.0)
    val map1 = mapOf(pair)
    map1.forEach { (k, v) -> println("Chave: $k, Valor: R$ $v")}
    val map2 = mapOf(
        "José" to 13400.0,
        "Maria" to 15000.0
    ) // recurso infix
    map2.forEach { (k, v) -> println("Chave: $k, Valor: R$ $v") }
}