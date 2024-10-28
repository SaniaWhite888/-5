fun main() {
    println("Введите начальное число: ")
    val start = readLine()!!.toInt()
    println("Введите шаг: ")
    val step = readLine()!!.toInt()

    for (i in 0..10) {
        val current = start + i
                println(current)
    }
}