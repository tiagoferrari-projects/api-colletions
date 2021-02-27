package one.digitalinnovation.collection

fun main() {
    val values = intArrayOf(1, 10, 2, 20, 3, 30)
    val separador = "------------------"

    values.forEach{
        println(it)
    }
    println(separador)

    values.sort()
    values.forEach{
        println(it)
    }
}