package lesson_9

fun main() {
    val printPortionRequest = "Введите количество порций - "
    print(printPortionRequest)
    val count = readln().toInt()
    val ingredientOfRecipe = listOf("Яйцо - " to 2, "Молоко - " to 50, "Сливочное масло - " to 15)
    val countForRecipe = ingredientOfRecipe.map { it.first + it.second * count }
    countForRecipe.forEach {
        println(it)
    }
}