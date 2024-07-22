package lesson_4

fun main() {

    val trainyDay = 3
    val isParity = trainyDay % 2

    println(
        """
        $TRAING_HAND ${isParity == DEF_COUNTER} 
        $TRAING_LEG ${isParity != DEF_COUNTER}
        $TRAING_BACK ${isParity != DEF_COUNTER}
        $TRAING_ABC ${isParity == DEF_COUNTER}
    """.trimIndent())
}

const val DEF_COUNTER = 1
const val TRAING_HAND = "Упражнения для рук:  "
const val TRAING_LEG = "Упражнения для ног:  "
const val TRAING_BACK = "Упражнения для спины:"
const val TRAING_ABC = "Упражнения для пресс:"
