package lesson_5

fun main() {
    print("Введите первое целое число от 0 до 42 - ")
    val inNumber1 = readln().toInt()
    print("Введите второе целое число от 0 до 42 - ")
    val inNumber2 = readln().toInt()
    val sumNumber = inNumber1 + inNumber2
    val resultText = if (sumNumber == (WIN_NUMBER_1 + WIN_NUMBER_2)) "Поздравляем! Вы выиграли главный приз!"
    else if ((inNumber2 == WIN_NUMBER_2 && inNumber1 != WIN_NUMBER_1) ||
            (inNumber2 != WIN_NUMBER_2 && inNumber1 == WIN_NUMBER_1)) "Вы выиграли утешительный приз!"
    else "Неудача!"
    println(resultText)
    println("Выигрышные числа: $WIN_NUMBER_1, $WIN_NUMBER_2.")

}

const val WIN_NUMBER_1 = 18
const val WIN_NUMBER_2 = 25

