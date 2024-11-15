package lesson_11

class User(
    val userId: Long, val login: String, val password: String, val email: String,
    )  {
}

fun main() {
    val user1 = User(
        userId = 1,
        login = "Ivan",
        password = (1..15000).random().toString(),
        email = "testsample1@sample.com"
    )
    val user2 = User(
        userId = 2,
        login = "Petr",
        password = (1..15000).random().toString(),
        email = "testsample2@sample.com"
    )
    println(user1.userId)
    println(user1.login)
    println(user1.password)
    println(user1.email)

    println(user2.userId)
    println(user2.login)
    println(user2.password)
    println(user2.email)
}