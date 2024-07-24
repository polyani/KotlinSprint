package lesson_5

fun main() {
    val WinNumbers: List<Int> = listOf((0..14).random(), (15..28).random(), (29..42).random())
    print("Введите первое число в диапазоне от 0 до 42: ")
    val inNumberList: MutableList<Int> = mutableListOf(readln().toInt())
    print("Введите второе число в диапазоне от 0 до 42: ")
    inNumberList.add(readln().toInt())
    print("Введите третье число в диапазоне от 0 до 42: ")
    inNumberList.add(readln().toInt())
    val commonNumbers = inNumberList.intersect(WinNumbers)
    val sizeCommonNumbers = commonNumbers.size
    val sizeWinNumbers = WinNumbers.size
    val resultText =
        if (sizeCommonNumbers == sizeWinNumbers) "Поздравляем! Вы выиграли главный приз!"
        else if (sizeCommonNumbers == (sizeWinNumbers - 1)) "Вы угадали два числа и получаете крупный приз!"
        else if (sizeCommonNumbers == (sizeWinNumbers - 2)) "Вы угадали одно число и выиграли утешительный приз!"
        else "Неудача! Вы не угадали ни одного числа."
    println(
        """
        $resultText
        
        Выигрышные числа: $WinNumbers.
        """.trimIndent()
    )
}