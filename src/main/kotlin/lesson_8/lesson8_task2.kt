package lesson_8

fun main() {

    val listOfIngredients = arrayOf("мука", "вода", "молоко", "соль", "сахар", "патока", "солод", "яйцо") // создать массив и присвоить значения

    print("Какой ингридиент Вы хотите найти - ")
    val findIngredient = readln()
    var isFound: Boolean = false // инициализация флага
    for (i in listOfIngredients) {
        if (i == findIngredient) {
            isFound = true
            break
        } else { isFound = false }
    }
    if (isFound == true)
        println("Ингридиент $findIngredient в рецепте есть.")
    else println("Такого ингредиента в рецепте нет.")
}