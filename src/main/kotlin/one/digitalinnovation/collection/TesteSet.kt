package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario("João", 8000.0,"CLT")
    val pedro = Funcionario("Pedro", 2000.0,"PJ")
    val maria = Funcionario("Maria", 4000.0,"CLT")

    val funcionarios1 = setOf<Funcionario>(joao, pedro)
    val funcionarios2 = setOf<Funcionario>(maria)
    val funcionarios3 = setOf<Funcionario>(joao, pedro, maria)

    println("operação união de conjuntos")
    val resultunion= funcionarios1.union(funcionarios2)
    resultunion.forEach { println(it) }
    println("operação subtração de conjuntos")
    val resultsubtract = funcionarios3.subtract(funcionarios2)
    resultsubtract.forEach { println(it) }
    println("operação intersecção de conjuntos")
    val resultintersect = funcionarios3.intersect(funcionarios2)
    resultintersect.forEach { println(it) }


}