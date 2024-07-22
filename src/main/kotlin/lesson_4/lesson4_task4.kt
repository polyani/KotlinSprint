package lesson_4

fun main() {

    var counter = 2
    counter = ++counter % 2

    println(
        """
        $TRAING_HAND ${counter == DEF_COUNTER_HAND} 
        $TRAING_LEG ${counter == DEF_COUNTER_LEG}
        $TRAING_BACK ${counter == DEF_COUNTER_BACK}
        $TRAING_ABC ${counter == DEF_COUNTER_ABC}
    """.trimIndent()
    )

}

const val DEF_COUNTER_HAND = 0
const val DEF_COUNTER_LEG = 1
const val DEF_COUNTER_BACK = 1
const val DEF_COUNTER_ABC = 0
const val TRAING_HAND = "Упражнения для рук:  "
const val TRAING_LEG = "Упражнения для ног:  "
const val TRAING_BACK = "Упражнения для спины:"
const val TRAING_ABC = "Упражнения для спины:"
