fun isAnagram(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) return false
    val charCounts = mutableMapOf<Char, Int>()
    for (char in str1) {
        charCounts[char] = (charCounts[char] ?: 0) + 1
    }
    for (char in str2) {
        if (charCounts[char] == null || charCounts[char] == 0) return false
        charCounts[char] = charCounts[char]!! - 1
    }
    return true
}

fun main() {
    println("Введите первую строку: ")
    val str1 = readLine()!!
    println("Введите вторую строку: ")
    val str2 = readLine()!!
    if (isAnagram(str1, str2)) {
        println("Строки являются анаграммами.")
    } else {
        println("Строки не являются анаграммами.")
    }
}