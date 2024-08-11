package lesson_6

fun main() {
    print("Введите нужное количество секунд - ")
    var needTime = readln().toInt()

    do {
        println("Осталось секунд: $needTime")
        Thread.sleep(1000)
        needTime--
    } while (needTime > 0)

    print("\nВремя вышло")
}