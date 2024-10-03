package lesson_10

fun main() {
    val userLogin: String
    val userPassword: String
    print(
        """Количество символов для логина не меньше 4 символов
        |Введите логин - 
    """.trimMargin()
    )
    userLogin = readln()

    print(
        """Количество символов для пароля не меньше 4 символов
            |Введите пароль - 
        """.trimMargin()
    )
    userPassword = readln()

    val resultValid = validationLong(userLogin, userPassword)
    if (resultValid == true) {
        println("Длинна логина и пароля достаточны")
    } else println("Логин или пароль недостаточно длинные.")
}

fun validationLong(userLogin: String, userPassword: String): Boolean {
    val lengthPass = 4
    val countUserLong = userLogin.count()
    val countUserPassword = userPassword.count()
    if (countUserLong >= lengthPass && countUserPassword >= lengthPass) {
        return true
    } else return false
}






