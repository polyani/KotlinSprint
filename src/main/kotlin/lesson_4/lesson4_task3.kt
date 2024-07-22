package lesson_4

fun main() {

    val availTheSun: Boolean = true
    val posTent: Boolean = true
    val humidAir = 20
    val season = ""
    val compConditios: Boolean = availTheSun == isSunny &&
                                posTent ==  isAwningOpen &&
                                humidAir == HUMID &&
                                season != THE_SEASON_4

    println("$DEF_TEXT $compConditios")

}

const val isSunny = true
const val  isAwningOpen = true
const val HUMID = 20
const val THE_SEASON_4 = "winter"
const val DEF_TEXT = "Благоприятные ли условия сейчас для роста бобовых? -"

