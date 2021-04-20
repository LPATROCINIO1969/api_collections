package one.digitalinnovation.collection

import java.math.BigDecimal

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal())


    val map = mapof("chave","valor")
    val nomes = Array<String>{"joao", "maria"}

    println("A somatoria dos salários é  ${salarios.somatoria()}")
    println("A media dos salários é ${salarios.media()}")
}

