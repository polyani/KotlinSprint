package lesson_6

fun main() {
    print("Введите нужное количество секунд - ")
    val needTime = readln().toInt()
    val timerSEC = (needTime * 1000).toLong()
    Thread.sleep(timerSEC)

    print("Прошло $needTime секунд")
}