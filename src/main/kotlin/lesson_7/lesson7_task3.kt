package lesson_7

fun main() {
    val inputNumber: Int
    print("Введите число - ")
    inputNumber = readln().toInt()
    val resRange = 0..inputNumber
    // println((resRange).filter { it % 2 == 0 }) // рабочий вариант

    for (i in 0..inputNumber step 2) {
        println(i)
    }

}