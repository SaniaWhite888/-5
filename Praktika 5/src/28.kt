fun main() {
    print("Введите количество чисел: ")
    val n = readLine()!!.toInt()

    val numbers = Array(n) { 0 }

    println("Введите $n чисел:")
    for (i in 0 until n) {
        numbers[i] = readLine()!!.toInt()
    }

    numbers.sort()

    println("Числа в порядке возрастания:")
    for (number in numbers) {
        print("$number ")
    }
}