package lesson_7

fun main() {
    val inputNumber: Int
    print("Введите число - ")
    inputNumber = readln().toInt()
    val resRange = 0..inputNumber
    println((resRange).filter { it % 2 == 0 })
}