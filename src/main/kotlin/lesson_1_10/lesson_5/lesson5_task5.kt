package lesson_1_10.lesson_5

fun main() {
    val winNumbers: List<Int> = listOf((0..14).random(), (15..28).random(), (29..42).random())
    println(winNumbers)
    val sizeWinNumbers = winNumbers.size
    print("Введите число в диапазоне от 0 до 42: ")
    val inNumberList: MutableList<Int> = mutableListOf(readln().toInt())
    for (i in 1 until sizeWinNumbers) {
        print("Введите число в диапазоне от 0 до 42: ")
        inNumberList.add(readln().toInt())
    }
    val commonNumbers = inNumberList.intersect(winNumbers)
    val sizeCommonNumbers = commonNumbers.size
    val resultText =
        when {
            (sizeCommonNumbers == sizeWinNumbers) -> "Поздравляем! Вы выиграли главный приз!"
            (sizeCommonNumbers == (sizeWinNumbers - 1)) -> "Вы угадали два числа и получаете крупный приз!"
            (sizeCommonNumbers == (sizeWinNumbers - 2)) -> "Вы угадали одно число и выиграли утешительный приз!"
            else -> "Неудача! Вы не угадали ни одного числа."
        }
    println(
        """
        $resultText
        
        Выигрышные числа: $winNumbers.
        """.trimIndent()
    )
}