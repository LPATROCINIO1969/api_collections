package one.digitalinnovation.collection

fun main() {
    val values = intArrayOf(2, 3, 4, 1, 10, 7)
    println("desordenado")
    values.forEach {
        println(it)
    }
    values.sort()
    println("ordenado")
    values.forEach {
        println(it)
    }

}