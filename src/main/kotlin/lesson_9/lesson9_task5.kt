package lesson_9

fun main() {
    val setIngredients = mutableSetOf<String>()
    println("Введите 5 ингредиентов")
    var index = 0
    while (index != 4) {
        print("Введите ингредиент - ")
        val ingredient = readln()
        setIngredients.add(ingredient)
        index = setIngredients.lastIndexOf(ingredient)
    }
    println(setIngredients.sorted().joinToString(", ").replaceFirstChar { it.uppercaseChar() })
}
