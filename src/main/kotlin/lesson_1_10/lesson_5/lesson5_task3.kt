package lesson_1_10.lesson_5

fun main() {
    print("Введите первое целое число от 0 до 42 - ")
    val inNumber1 = readln().toInt()
    print("Введите второе целое число от 0 до 42 - ")
    val inNumber2 = readln().toInt()
    val resultText = if ((inNumber1 == WIN_NUMBER_1 && inNumber2 == WIN_NUMBER_2) ||
        (inNumber1 == WIN_NUMBER_2 && inNumber2 == WIN_NUMBER_1)) "Поздравляем! Вы выиграли главный приз!"
    else if ((inNumber1 == WIN_NUMBER_1 && inNumber2 != WIN_NUMBER_2) ||
        (inNumber1 == WIN_NUMBER_2 && inNumber1 != WIN_NUMBER_1) ||
        (inNumber2 == WIN_NUMBER_1 && inNumber2 != WIN_NUMBER_2)) "Вы выиграли утешительный приз!"
    else "Неудача!"
    println(resultText)
    println("Выигрышные числа: $WIN_NUMBER_1, $WIN_NUMBER_2.")

}

const val WIN_NUMBER_1 = 18
const val WIN_NUMBER_2 = 25
