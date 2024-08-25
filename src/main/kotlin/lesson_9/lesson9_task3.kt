package lesson_9

fun main() {
    val printPortionRequest = "Введите количество порций - "
    val ingredientOfRecipe = mutableMapOf("Яйцо" to 2, "Молоко" to 50, "Сливочное масло" to 15)
    val unitOfMeasure = listOf("шт.", "мл.", "гр.")
    var indexUnitOfMeasure = 0
    // запрос на количество порций
    print(printPortionRequest)
    val portion = readln().toInt()

    for ((key, value) in ingredientOfRecipe) {
        print("$key - ${value * portion} ")
        println(unitOfMeasure[indexUnitOfMeasure])
        indexUnitOfMeasure++
    }
}