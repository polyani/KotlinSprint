package lesson_11

class User2(
    val userId: Long,
    val login: String,
    var password: String,
    val email: String,

    ) {
    private var bio: String

    init {
        bio = "no date"
    }

    fun outInfoUser() {
        println("User id -  $userId")
        println("User login - $login")
        println("User password -  $password")
        println("User email - $email")
        println("User bio - $bio")
    }

    fun readFromConsoleBio() {
        println("Добавьте свойства био: ")
        bio = readln()
    }

    fun changePass() {
        var checkPass: String? = null
        do {
            println("Введите старый пароль - ")
            checkPass = readln()
            if (password != checkPass) {
                println("Введите старый пароль - ")
                checkPass = readln()
            } else {
                println("Введите новый пароль - ")
                password = readln()
                println("Пароль успешно изменён")
                break
            }
        } while (checkPass != password)
    }
}

fun main() {

    val user1 = User2(
        userId = 1,
        login = "testUser1",
        password = "testPassUs125",
        email = "test@test.com",
    )

    user1.readFromConsoleBio()
    println()
    user1.changePass()
    println()
    user1.outInfoUser()

}