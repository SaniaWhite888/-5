fun main() {
    while (true) {
        print("Введите первую цифру: ")
        val num1 = readLine()!!.toInt()
        print("Введите вторую цифру: ")
        val num2 = readLine()!!.toInt()

        print("Введите операцию (+ или ): ")
        val operation = readLine()!!

        val result = when (operation) {
            "+" -> num1 + num2
            "" -> num1 + num2
            else -> {
                println("Неверная операция.")
                continue
            }
        }

        println("Результат: $result")

        print("Введите \"стоп\", чтобы завершить, или любое другое слово, чтобы продолжить: ")
        val stop = readLine()!!
        if (stop.equals("стоп", ignoreCase = true)) break
    }
}