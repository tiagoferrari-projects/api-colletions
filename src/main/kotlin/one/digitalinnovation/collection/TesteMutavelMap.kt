package one.digitalinnovation.collection

fun main() {
    val marcos = Funcionario("Marcos",4500.0, "CLT")
    val lucas = Funcionario("Lucas",3500.0, "CLT")
    val joao = Funcionario("João",1500.0,"PJ")
    val separador = "------------------"

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome,joao)
    repositorio.create(lucas.nome,lucas)
    repositorio.create(marcos.nome,marcos)

    println(repositorio.findById(marcos.nome))

    println(separador)
    repositorio.findAll().forEach { println(it) }

    println(separador)
    repositorio.remove(joao.nome)
    repositorio.findAll().forEach { println(it) }
}