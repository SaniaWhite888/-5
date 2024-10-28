fun isPalindrome(str: String): Boolean {
    val cleanedStr = str.replace("[^A-Za-z0-9]".toRegex(), "").lowercase()
    return cleanedStr == cleanedStr.reversed()
}

fun main() {
    println("Введите строку: ")
    val str = readLine()!!
    if (isPalindrome(str)) {
        println("Строка является палиндромом.")
    } else {
        println("Строка не является палиндромом.")
    }
}