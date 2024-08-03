package lesson_7

fun main() {

    print("Введите количество символов в пароле (минимальное 6символов) - ")
    var leightPass = readln().toInt()
    val charList = ('A'..'Z') + ('a'..'z') + (0..9)
    var resultPass = ""

    while (leightPass < 6) {
        print(
            """Введенное количество символов меньше 6
        |Введите количество символов в пароле - 
        """.trimMargin()
        )
        leightPass = readln().toInt()

    }

    for (i in 1..leightPass) {
        resultPass = resultPass + charList.random().toString()
    }
    print(resultPass)
}