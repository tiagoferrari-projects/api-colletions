package one.digitalinnovation.collection

fun main() {
    val salarios = DoubleArray(3)
    val separador = "------------------"

    salarios[0] = 2000.00
    salarios[1] = 1200.00
    salarios[2] = 4500.00

    salarios.forEach { println(it) }

    println(separador)

    salarios.forEachIndexed{index, salario ->
    salarios[index] = salario * 1.1}
    salarios.forEach{println(it)}

    println(separador)

    val salarios2 = doubleArrayOf(1200.0, 2000.0, 4500.0)
    salarios2.sort()
    salarios2.forEach { println(it) }

}