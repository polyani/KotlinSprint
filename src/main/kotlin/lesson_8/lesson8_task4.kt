package lesson_8

fun main() {
    val listOfIngredients = arrayOf("мука", "вода", "молоко", "соль", "сахар", "патока", "солод", "яйцо")

    fun outPrint() {
        for (i in listOfIngredients) {
            println("${listOfIngredients.indexOf(i) + 1} - $i")
        }
    }
    println("Список ингредиентов:")
    outPrint()

    print(("\nКакой ингредиент нужно заменить? \nВведите - "))
    var inChange = readln()
    var contIngr = listOfIngredients.indexOf(inChange) // ищем индекс введённого значения в объявленном списке

    while (contIngr == -1) {
        println("Такого ингредиента в списке нет\nВведите элемент из списка - ")
        inChange = readln()
        contIngr = listOfIngredients.indexOf(inChange)
    }

    print("Введите новый ингредиент - ")
    val newIngredient = readln()
    listOfIngredients.set(contIngr, newIngredient)

    println("“Готово! Вы сохранили следующий список:")
    outPrint()

}