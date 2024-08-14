package lesson_8

fun main() {
    print("Введите количество ингредиентов: ")
    val countOfIngredients = readln().toInt()
    var arrayOfIngredients = arrayOfNulls<String>(countOfIngredients)

    for (i in arrayOfIngredients.indices) {
        print("Введите ингридиент номер ${i + 1}: ")
        arrayOfIngredients[i] = readln()
    }

    println(arrayOfIngredients.joinToString(", "))
}