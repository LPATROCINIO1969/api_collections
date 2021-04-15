package one.digitalinnovation.collection

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    println("Lista de salarios")
    for (salario in salarios){
        println(salario)
    }
    println("Parâmetros estatísticos")
    println("Maior Salárío é ${salarios.maxOrNull()}")
    println("Menor Salário é ${salarios.minOrNull()}")
    println("Média dos Salários é ${salarios.average()}")

    val salarioMaiorQue2500 = salarios.filter { it > 2500 }
    println("Salários maiores que 2500:")
    salarioMaiorQue2500.forEach{
        println(it)
    }
    println("Número de Salários de 2000 a 5000:")
    println(salarios.count{it in 2000.0..5000.0})
    println(salarios.find{it == 2250.0})

    println(salarios.any{it == 1000.0})





}
