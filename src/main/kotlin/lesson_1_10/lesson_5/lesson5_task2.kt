package lesson_1_10.lesson_5

fun main() {
    print("Введите Ваш год рождения - ")
    val yearOfBirth = readln().toInt()
    val userAge = CURRENT_YEAR - yearOfBirth
    val resultText = if (userAge >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else "Вернуться на главный экран"
    println(resultText)
}

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2024