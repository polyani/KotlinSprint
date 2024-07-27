package lesson_6

fun main() {

    print("Введите имя пользователя: ")
    val userName = readln()

    print("Придумайте пароль: ")
    val userPassword = readln()
    print("Повторите пароль")
    var inCheckPass = readln()
    while (inCheckPass != userPassword) {
        print(
            """
        Введенный пароль не совпадает!
        Повторите пароль - 
    """.trimIndent()
        )
        inCheckPass = readln()
    }

    print(
        """
        Для входа в приложение, введите имя и пароль пользователя.
        Введите имя - 
    """.trimIndent()
    )
    var checkUserName = readln()

    while (checkUserName != userName) {
        println("Имя пользователя введено неверно.")
        print("Для входа в приложение, введите имя пользователя - ")
        checkUserName = readln()
    }

    print("Введите пароль - ")
    var checkUserPass = readln()

    while (checkUserPass != userPassword) {
        println("Введен не существующий пароль.")
        print("Введите пароль - ")
        checkUserPass = readln()
    }

    print("\nАвторизация прошла успешно")

}