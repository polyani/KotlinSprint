package lesson_10

fun main() {
    val resultValid = validationLong()
    if (resultValid == true) {
        println("Длинна логина и пароля достаточны")
    } else println("Логин или пароль недостаточно длинные.")

}

fun validationLong(): Boolean {
    val countUserLong = getUserName().count()
    val countUserPassword = getUserPassword().count()
    if (countUserLong >= 4 && countUserPassword >= 4) {
        return true
    } else return false
}

fun getUserName(): String {
    print(
        """Количество символов для логина не меньше 4 символов
        |Введите логин - 
    """.trimMargin()
    )
    val userLogin = readln()
    return userLogin
}

fun getUserPassword(): String {
    print(
        """Количество символов для пароля не меньше 4 символов
            |Введите пароль - 
        """.trimMargin()
    )
    val userPassword = readln()
    return userPassword
}





