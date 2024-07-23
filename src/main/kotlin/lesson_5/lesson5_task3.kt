package lesson_5

fun main(){
    print("Введите первое целое число от 0 до 42 - ")
    val inNumber1 = readln().toInt()
    print("Введите второе целое число от 0 до 42 - ")
    val inNumber2 = readln().toInt()
    val resultText = if (inNumber2 == IS_WIN_NUMBER_2 && inNumber1 == IS_WIN_NUMBER_1) "Поздравляем! Вы выиграли главный приз!"
    else if (inNumber2 == IS_WIN_NUMBER_2 && inNumber1 != IS_WIN_NUMBER_1) "Вы выиграли утешительный приз!"
    else if (inNumber2 != IS_WIN_NUMBER_2 && inNumber1 == IS_WIN_NUMBER_1) "Вы выиграли утешительный приз!"
    else "Неудача!"
    println(resultText)
    println("Выигрышные числа: $IS_WIN_NUMBER_1, $IS_WIN_NUMBER_2.")

}
const val IS_WIN_NUMBER_1 = 18
const val IS_WIN_NUMBER_2 = 25

