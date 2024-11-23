package lesson_1_10.lesson_9

fun main() {
    val listOfIngedients = listOf("Ветчина", "Копченая колбаса", "Оливки", "Корнишоны", "Каперсы", "Вода", "Говядина",
                                  "Копченые ребрышки", "Лук", "Лавровый лист", "Душистый перец", "Соль")
    var ingredient: String
    println("В рецепте есть следующие ингредиенты:")
    for (ingredient in listOfIngedients)
        println(ingredient)
}