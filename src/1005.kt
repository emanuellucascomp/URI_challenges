import java.util.Scanner

fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    var parcela1 = input.nextDouble()
    var parcela2 = input.nextDouble()

    val MEDIA = ((parcela1 * 3.5) + (parcela2 * 7.5)) / 11
    println("MEDIA = " + "%.5f".format(MEDIA))
}