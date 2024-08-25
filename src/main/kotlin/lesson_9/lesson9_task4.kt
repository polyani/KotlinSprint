package lesson_9

/*
Напиши программу, которая один раз запрашивает у пользователя пять названий ингредиентов блюда в одной строке, разделяя их запятыми (с пробелом).

- запроси у пользователя 5 ингредиентов, перечисленных через “, ” (запятая с пробелом) и сохрани их в список, где каждый ингредиент — отдельный элемент;
- отсортируй полученный список по алфавиту и выведи его в консоль;
- используй тот метод сортировки, который возвращает новую отсортированную коллекцию.
 */

fun main() {
    val ingredients = mutableListOf<String>()
    print("Введите 5 ингредиентов в форме {ингредиент, }" + " - ")
    val inputString = readln()
    val resultList = inputString.split(", ")
    ingredients.addAll(resultList)
    ingredients.sort()
//    println(ingredients)
    for ((index, ingredient) in ingredients.withIndex()) {
        println("${index + 1}. $ingredient ")
    }
}