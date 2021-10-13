import kotlin.math.pow

fun main(args: Array<String>) {
    val number = 2
    val power = 3
    val answer = number.toDouble().pow(power)
    println("$number raise to $power : ${answer.toLong()}")
}