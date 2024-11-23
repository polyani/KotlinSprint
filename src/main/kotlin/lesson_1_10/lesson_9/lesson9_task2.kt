package lesson_1_10.lesson_9


fun main() {

    val mutableListIngredients: MutableList<String> = mutableListOf("Вода", "Соль", "Гречка")
    println("В рецепте есть базовые ингредиенты:")

    fun printList() {
        for (ingredient in mutableListIngredients)
            println(ingredient)
    }
    printList()

    print("Желаете добавить еще ингредиент? Введите \"да\" или \"нет\" - ")
    val wantIng = readln()

    if (wantIng.lowercase() == "да") {
        print("Какой ингредиент вы хотите добавить? - ")
        val newIngredient = readln()
        mutableListIngredients.add(newIngredient)
        println("Теперь в рецепте есть следующие ингредиенты:")
        printList()
    }
}