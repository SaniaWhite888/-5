fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}

fun main() {
    println("Введите начало диапазона: ")
    val start = readLine()!!.toInt()
    println("Введите конец диапазона: ")
    val end = readLine()!!.toInt()

    for (i in start..end) {
        if (isPrime(i)) {
            println(i)
        }
    }
}