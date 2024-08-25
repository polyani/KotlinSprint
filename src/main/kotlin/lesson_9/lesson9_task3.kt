package lesson_9

fun main() {
    val printPortionRequest = "Введите количество порций - "
    val ingredientOfRecipe = listOf("Яйцо", "Молоко", "Сливочное масло")
    val countOfIngedient = mutableListOf(2, 50, 15)
    val unitOfMeasure = listOf("шт.", "мл.", "гр.")

    // запрос на количество порций
    print(printPortionRequest)
    val portion = readln().toInt()

    for ((index, ingredient) in ingredientOfRecipe.withIndex()) {
        print("${index + 1}. $ingredient ") // вывод номера в списке
        print(countOfIngedient[index] * portion) // расчет и вывод рассчитываемого кол-ва
        print(" ")  // пробел на выводе перед элементами из 3-го списка
        println(unitOfMeasure[index])
    }
}