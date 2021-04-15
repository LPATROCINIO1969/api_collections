package one.digitalinnovation.collection

fun main() {
    val salarios = DoubleArray(3)
    salarios[0]= 1000.00
    salarios[1] = 3000.00
    salarios[2] = 500.0

    println("imprime na ordem de posição no array")
    salarios.forEach {
        println(it)
    }
    println("acrescentando um aumento de salario")
    salarios.forEachIndexed { index, salario ->
         salarios[index] = salario*1.1
    }
    salarios.forEach {
        println(it)
    }


}