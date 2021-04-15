package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario("João", 8000.0,"CLT")
    val pedro = Funcionario("Pedro", 2000.0,"PJ")
    val maria = Funcionario("Maria", 4000.0,"CLT")

    val funcionarios = listOf<Funcionario>(joao, pedro, maria)

    println("Imprimindo a lista de funcionários")
    funcionarios.forEach {
        println(it)
    }
    println("Imprimindo apenas um funcionário")
    println(funcionarios.find{it.nome=="Maria"})
    println("Imprimindo a lista ordenada por salário")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("Imprimindo agrupado")
    funcionarios.groupBy { it.tipoContratacao }.forEach{println(it)}

}



data class Funcionario(
        val nome:String,
        val salario: Double,
        val tipoContratacao:String

 ){
    override fun toString():String =
        """
           Nome: $nome
           Salario: $salario
        """.trimIndent()
}

