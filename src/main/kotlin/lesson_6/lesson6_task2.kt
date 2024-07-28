package lesson_6

fun main() {
    print("Введите нужное количество секунд - ")
    var needTime = readln().toInt()
    val solTime = needTime

    for (i in needTime downTo 1) {
        Thread.sleep(1000)
        needTime--
    }

    print("Прошло $solTime секунд")
}