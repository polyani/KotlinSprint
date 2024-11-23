package lesson_1_10.lesson_6

fun main() {
    val mysteryNumber: Int = ((1..9).random())
    println(mysteryNumber)
    print("Введите число: ")
    var inputNumber = readln().toInt()
    var countAttempt = 4

    for (i in countAttempt downTo 1) {
        if (mysteryNumber == inputNumber) {
            "Это была великолепная игра!"
            break
        } else print("Неверное число, осталось попыток $i Введите число снова - ")
        inputNumber = readln().toInt()

    }

    println("Выигрышное число $mysteryNumber")

}