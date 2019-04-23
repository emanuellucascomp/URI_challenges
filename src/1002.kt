import java.util.Scanner

fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    val n = 3.14159
    var raio = input.nextDouble()

    val area = n * raio * raio
    println("A=" + "%.4f".format(area))
}