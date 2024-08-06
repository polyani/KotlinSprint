package lesson_8

fun main() {


    val listOfIngredients = arrayOf("мука", "вода", "молоко", "соль", "сахар", "патока", "солод", "яйцо")

    print("Какой ингридиент Вы хотите найти - ")
    val findIngredient = readln()

    val arrSize = listOfIngredients.size

    for (i in listOfIngredients) {
        if (i == findIngredient) {
            println("Ингридиент $findIngredient в рецепте есть.")
            break
        } else {
            if (arrSize == listOfIngredients.indexOf(i) + 1)
                println("Такого ингридиента в рецепте нет.")
        }
    }
}
    // вариант решения без цикла
//    val exist = listOfIngredients.contains(findIngredient)
//    if (exist) println("Ингридиент $findIngredient в рецепте есть.")
//    else println("Такого ингридиента в рецепте нет.")