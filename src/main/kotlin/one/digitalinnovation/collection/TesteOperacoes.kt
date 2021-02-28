package one.digitalinnovation.collection

fun main() {
    val salarios = doubleArrayOf(1050.0, 8250.0, 15000.0)
    val separador = "------------------"

    for (salario in salarios){
        println("R$ $salario")
    }

    println(separador)
    println("Maior salário: R$ ${salarios.maxOrNull()}")
    println("Menor salário: R$ ${salarios.minOrNull()}")
    println("Média salarial: R$ ${salarios.average()}")

    println(separador)
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    salariosMaiorQue2500.forEach{ println(it)}

    println(separador)
    println(salarios.count{it in 1000.0 .. 10000.0 })

    println(separador)
    println(salarios.find { it == 8250.0 })
    println(salarios.find { it == 500.0 })

    println(separador)
    println(salarios.find { it == 1050.0 })
    println(salarios.find { it == 500.0 })
}