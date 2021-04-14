package one.digitalinnovation.collection

fun main() {
    val nomes =Array<String>(3){" "}
    nomes[0]="João Rodrigues"
    nomes[1]="Nadia Mendonça"
    nomes[2]="Cris Cristoferson"

    println("Imprime na ordem de colocação")
    for (nome in nomes) println(nome)
    println("Imprime na ordem alfabética")
    nomes.sort()
    for (nome in nomes) println(nome)
}