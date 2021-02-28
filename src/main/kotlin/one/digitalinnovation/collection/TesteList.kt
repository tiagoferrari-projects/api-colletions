package one.digitalinnovation.collection

fun main() {
    val mateus = Funcionario("Mateus",2500.0, "PJ")
    val marcos = Funcionario("Marcos",4500.0, "CLT")
    val lucas = Funcionario("Lucas",3500.0, "CLT")
    val joao = Funcionario("João",1500.0,"PJ")
    val separador = "------------------"

    val funcionarios = listOf(mateus, marcos, lucas, joao)
    funcionarios.forEach{println(it)}

    println(separador)
    println(funcionarios.find { it.nome == "Marcos" })

    println(separador)
    funcionarios
        .sortedBy {it.salario}
        .forEach{println(it)}

    println(separador)
    funcionarios
        .groupBy{it.tipoContratacao}
        .forEach{println(it)}
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){
    override fun toString(): String =
    """ 
        Nome: $nome
        Salário: R$ $salario
    """ .trimIndent()
}