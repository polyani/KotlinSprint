package lesson_1_10.lesson_4

fun main() {

    val isAvailTheSun: Boolean = true
    val isPosTent: Boolean = true
    val humidAir = 20
    val season = ""
    val compConditios: Boolean = isAvailTheSun == IS_SUNNY &&
                                isPosTent ==  IS_AWNING_OPEN &&
                                humidAir == HUMID &&
                                season != THE_SEASON_4

    println("$DEF_TEXT $compConditios")

}

const val IS_SUNNY = true
const val  IS_AWNING_OPEN = true
const val HUMID = 20
const val THE_SEASON_4 = "winter"
const val DEF_TEXT = "Благоприятные ли условия сейчас для роста бобовых? -"