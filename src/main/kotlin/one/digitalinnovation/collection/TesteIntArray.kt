package one.digitalinnovation.collection

fun main() {
    val values = IntArray(6)

    values[0] = 7
    values[1] = 8
    values[2] = 27
    values[3] = 2
    values[4] = 8
    values[5] = 25
    //
    for(valor in values){
        println(valor)
    }
    //
    println("-----------------------------")
    //
    values.forEach {valor ->
        println(valor)
    }
    //
    println("-----------------------------")
    //
    for(index in values.indices){
        println(values[index])
    }
    //
    println("-----------------------------")
    //
    values.sort()
    for(valor in values){
        println(valor)
    }
}