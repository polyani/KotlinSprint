package lesson_9

fun main() {
    var countIndex = 0
    val ingredientsList: MutableList<String> = mutableListOf()
    println("Введите 5 ингредиентов.")
    while (countIndex != 5) {
        print("Введите ингредиент - ")
        val ingredientIn = readln()
        if (ingredientsList.contains(ingredientIn)) {
        } else {
            ingredientsList.add(ingredientIn)
            countIndex = ingredientsList.lastIndex + 1
        }
    }
    ingredientsList.sort()
    ingredientsList[0] = ingredientsList[0].replaceFirstChar(Char::uppercaseChar)
    println(ingredientsList)
}