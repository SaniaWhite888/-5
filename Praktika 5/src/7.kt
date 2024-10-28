fun main() {
    print("Введите число N: ")
    val n = readLine()!!.toInt()

    var a = 0
    var b = 1

    for (i in 1..n) {
        println(a)
        val temp = a
        a = b
        b += temp
    }
}