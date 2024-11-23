package lesson_1_10.lesson_7

fun main() {

    print("Введите количество символов в пароле (минимальное 6символов) - ")
    var leightPass = readln().toInt()
    val charCapitalList = ('A'..'Z')
    val charLowerList = ('a'..'z')
    val numberList = (0..9)
    var resPass = emptyArray<String>()

    while (leightPass < 6) {
        print(
            """Введенное количество символов меньше 6
        |Введите количество символов в пароле - 
        """.trimMargin()
        )
        leightPass = readln().toInt()
    }

    if (leightPass % 3 != 0) {
        leightPass = (leightPass / 3 + 1)
    } else leightPass = (leightPass / 3)

    for (i in 1..leightPass) {
        resPass = resPass + charCapitalList.random().toString() + numberList.random().toString() +
                charLowerList.random().toString()
    }
    resPass.shuffle()
    resPass.forEach { print(it) }
}