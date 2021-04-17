package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario("João", 8000.0,"CLT")
    val pedro = Funcionario("Pedro", 2000.0,"PJ")
    val maria = Funcionario("Maria", 4000.0,"CLT")

    val repositorio = Repositorio<Funcionario>()
    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome,maria)
    repositorio.create(pedro.nome,pedro)

    println(repositorio.findById(joao.nome))
}