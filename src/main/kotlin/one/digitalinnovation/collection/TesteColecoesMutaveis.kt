package one.digitalinnovation.collection

fun main() {
    val mateus = Funcionario("Mateus",2500.0, "PJ")
    val marcos = Funcionario("Marcos",4500.0, "CLT")
    val lucas = Funcionario("Lucas",3500.0, "CLT")
    val joao = Funcionario("João",1500.0,"PJ")
    val separador = "------------------"

    println("--------LIST--------")
    val funcionarios = mutableListOf(joao, mateus,marcos)
    funcionarios.forEach { println(it) }

    println(separador)
    funcionarios.add(lucas)
    funcionarios.forEach { println(it) }

    println(separador)
    funcionarios.remove(mateus)
    funcionarios.forEach { println(it) }

    println("--------SET--------")

    val funcionarioSet = mutableSetOf(mateus)
    funcionarioSet.forEach { print(it) }

    println()
    println(separador)
    funcionarioSet.add(marcos)
    funcionarioSet.add(lucas)
    funcionarioSet.forEach { println(it) }

    println(separador)
    funcionarioSet.remove(mateus)
    funcionarioSet.forEach { println(it) }
}
