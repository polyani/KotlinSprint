package lesson_4

fun main() {

    val numberDay = 6
    val isEven = (numberDay % 2 == 0)

    println(
        """
        $TRAING_HAND ${!isEven}
        $TRAING_LEG ${isEven}
        $TRAING_BACK ${isEven}
        $TRAING_ABC ${!isEven}   
        """.trimIndent()
    )
}

const val TRAING_HAND = "Упражнения для рук:  "
const val TRAING_LEG = "Упражнения для ног:  "
const val TRAING_BACK = "Упражнения для спины:"
const val TRAING_ABC = "Упражнения для пресс:"