package one.digitalinnovation.collection

fun main() {
    val mateus = Funcionario("Mateus",2500.0, "PJ")
    val marcos = Funcionario("Marcos",4500.0, "CLT")
    val lucas = Funcionario("Lucas",3500.0, "CLT")
    val joao = Funcionario("João",1500.0,"PJ")
    val separador = "------------------"

    val funcionarios1 = setOf(joao,mateus)
    val funcionarios2 = setOf(lucas)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{ println(it)} // unir

    println(separador)
    val funcionarios3 = setOf(lucas,marcos,joao,mateus)
    val resulSubtract = funcionarios3.subtract(funcionarios2)
    resultUnion.forEach{ println(it)} // subtrair o que é comum

    println(separador)
    val resultIntersect = funcionarios3.intersect(funcionarios1)
    resultIntersect.forEach { println(it) } // apenas o que é comum
}