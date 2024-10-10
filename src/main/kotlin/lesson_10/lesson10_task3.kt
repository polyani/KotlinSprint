package lesson_10

fun main() {
    println(generatePassword(invateLongPassowrd()))
}

fun invateLongPassowrd(): Int {
    println("Введите количество символов, не более 16")
    val countNumbers = readln().toInt()
    return countNumbers
}

fun generatePassword(length: Int): String {
    val passwordSpecChars = (' '..'/')
    val passwordNumberChars = (0..9)
    val resultList = mutableSetOf<Any>()
    repeat(length) {
        if (it % 2 == 0) resultList.add(passwordNumberChars.random())
        else resultList.add(passwordSpecChars.random())
    }
    return resultList.joinToString("")
}


