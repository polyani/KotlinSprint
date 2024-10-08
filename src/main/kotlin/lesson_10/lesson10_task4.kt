package lesson_10

fun main() {

    var resRollRobot: Short
    var resRollHuman: Short
    var countWinHuman: Long = 0
    var responsse = "Да".equals("да", true)
    println("Начало игры")
    while (responsse == true) {
        resRollRobot = rollTheDice()
        resRollHuman = rollTheDice()
        println("Бросок человека - $resRollHuman")
        println("Бросок компьютера - $resRollRobot")
        if (resRollRobot > resRollHuman) println("Выиграл компьютер")
        else if (resRollRobot < resRollHuman) {
            println("Выиграл человек")
            countWinHuman += 1
        } else println("Ничья")
        responsse = roundGame()
    }
    println("Человек выиграл $countWinHuman партий")
}

// метод бросить кости
private fun rollTheDice(): Short = (1..6).random().toShort()

private fun roundGame(): Boolean {
    println("Хотите бросить кости еще раз? Введите \"Да\" или \"Нет\"")
    val answer = readln()
    return answer.equals("Да", true)
}