package one.digitalinnovation.collection

fun main() {
    val values = IntArray(5)
    for(cont in 1..5) values[cont-1]=10 -cont
    println("primeira forma")
    for (valor in values){
        println(valor)
    }
    println("segunda forma")
    values.forEach {
        println(it)
    }
    println("Terceira forma")
    for ((index, it) in values.withIndex()) {
        println(it)
    }
    println("ordenando os dados do array")
    values.sort()
    for (valor in values){
        println(valor)
    }
}