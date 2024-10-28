fun sumOfSquares(n: Int): Int {
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    return sum
}

fun main() {
    println("Введите число N: ")
    val n = readLine()!!.toInt()
    val sum = sumOfSquares(n)
    println("Сумма квадратов чисел от 1 до $n равна $sum.")
}