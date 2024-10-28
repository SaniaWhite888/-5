fun main() {
    println("Введите высоту лестницы: ")
    val height = readLine()!!.toInt()

    for (i in 1..height) {
        repeat(i) { print("#") }
        println()
    }
}