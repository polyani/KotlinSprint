package lesson_8

fun main() {
    val listOfIngredients = arrayOf("мука", "вода", "молоко", "соль", "сахар", "патока", "солод", "яйцо")

    print("Какой ингридиент Вы хотите найти - ")
    val findIngredient = readln()

    if (findIngredient in listOfIngredients) println("Ингридиент $findIngredient в рецепте есть.")
    else println("Такого ингридиента в рецепте нет.")
}