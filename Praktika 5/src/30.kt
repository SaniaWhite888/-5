fun main() {
    println("Введите целое число:")
    val decimal = readLine()!!.toInt()

    val binary = decimalToBinary(decimal)

    println("$decimal в двоичной системе: $binary")
}

fun decimalToBinary(decimal: Int): String {
    var num = decimal
    var binary = ""
    while (num > 0) {
        val remainder = num % 2
        binary = remainder.toString() + binary
        num /= 2
    }
    return binary
}