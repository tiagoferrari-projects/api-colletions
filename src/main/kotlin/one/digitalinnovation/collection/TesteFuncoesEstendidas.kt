package one.digitalinnovation.collection

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )
    val separador = "---------------"

    salarios.forEach { println(it) }

    println(separador)
    println(salarios.somatoria())

    println(separador)
    println(salarios.media())
}