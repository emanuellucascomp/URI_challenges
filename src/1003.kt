import java.util.Scanner

fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    var parcela1 = input.nextInt()
    var parcela2 = input.nextInt()

    val SOMA = parcela1 + parcela2
    println("SOMA = $SOMA")
}