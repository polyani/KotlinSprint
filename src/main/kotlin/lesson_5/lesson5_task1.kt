package lesson_5

fun main() {

    print("Введите сумму чисел 5 и 6 = ")
    val inSum: Int = readln().toInt()
    val corrSum = 11

    if(inSum == corrSum){
        println("Добро пожаловать!")
    }
    else print("Доступ запрещён")
}