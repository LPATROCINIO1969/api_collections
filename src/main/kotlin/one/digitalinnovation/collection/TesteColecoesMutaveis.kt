package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario("João", 8000.0,"CLT")
    val pedro = Funcionario("Pedro", 2000.0,"PJ")
    val maria = Funcionario("Maria", 4000.0,"CLT")

    val funcionarios = mutableListOf(joao, maria)

    println("Imprimindo a lista de funcionários")
    funcionarios.forEach {
        println(it)
    }
    println("Adicionando funcionários")
    funcionarios.add(pedro)
    funcionarios.forEach {
        println(it)
    }
    println("Removendo funcionários")
    funcionarios.remove(joao)
    funcionarios.forEach {
        println(it)
    }

    println("Criando um conjunto mutável")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach {
        println(it)
    }
    println("adicionando funcionario ao conjunto mutável")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach {
        println(it)
    }
    println("removendo funcionario ao conjunto mutável")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach {
        println(it)
    }

}