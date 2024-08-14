package lesson_8

fun main() {
    var listOfIngredients = arrayOf("мука", "вода", "молоко", "соль", "сахар", "патока", "солод", "яйцо")
    fun outPrint() {
        for (i in listOfIngredients) {
            println("${listOfIngredients.indexOf(i) + 1} - $i")
        }
    }
    println("Список ингредиентов:")
    outPrint()

    print(("\nКакой ингредиент нужно заменить? \nВведите - "))
    var inChange = readln()
    var exist = listOfIngredients.contains(inChange) // результат Boolean
    while (exist == false) {
        println("Такого ингредиента в списке нет\nВведите элемент из списка - ")
        inChange = readln()
        exist = listOfIngredients.contains(inChange)
    }

    val existIndex = listOfIngredients.indexOf(inChange) // индекс элемента от 0

    if (existIndex >= 0) {
        print("Введите новый ингредиент - ")
        val newIngredient = readln()
        listOfIngredients.set(existIndex, newIngredient)
    }
    println("“Готово! Вы сохранили следующий список:")
    outPrint()

}