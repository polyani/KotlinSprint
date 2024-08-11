package lesson_5

fun main() {

    print("Введи, пожалуйста, свое имя пользователя - ")
    val userName = readln()
    val result = if (userName == REG_USER) {
        print("Введи, пожалуйста, свой пароль - ")
        val userPassword = readln()
        if (userPassword == VALID_PASSWORD) "Вам разрешено входить на борт корабля \"Heart of Gold\""
        else "Пароль неверный"
    } else "Зарегистрируйтесь, пожалуйста!"
    println(result)
}

const val REG_USER = "Zaphod"
const val VALID_PASSWORD = "PanGalactic"