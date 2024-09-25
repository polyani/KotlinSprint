package lesson_10

fun main() {
    val resRollRobot = rollTheDice()
    val resRollHuman = rollTheDice()
    println("Бросок компьютера - $resRollRobot")
    println("Бросок человека - $resRollHuman")
    if (resRollRobot > resRollHuman) println("Выиграл компьютер")
    else if (resRollRobot < resRollHuman) println("Выиграл человек")
    else println("Ничья")
}

// метод бросить кости
fun rollTheDice(): Short = (1..6).random().toShort()