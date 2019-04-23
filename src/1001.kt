import java.util.Scanner

fun main(args : Array<String>) {
    val input = Scanner(System.`in`)

    val firstInput = input.nextInt()
    val secondInput = input.nextInt()
    val sum = firstInput + secondInput
    println("X = $sum")
}