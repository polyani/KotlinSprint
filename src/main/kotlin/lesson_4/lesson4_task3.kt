package lesson_4

fun main() {

    val availTheSun: Boolean = true
    val posTent: Boolean = true
    val humidAir = 20
    val season = ""
    val compConditios: Boolean = (availTheSun == THE_SUN) && (posTent == THE_TENT_OPEN) &&
            (humidAir == HUMID) && !(season == THE_SEASON_4)

    println("$DEF_TEXT $compConditios")

}

const val THE_SUN = true
const val THE_TENT_OPEN = true
const val HUMID = 20
const val THE_SEASON_4 = "winter"
const val DEF_TEXT = "Благоприятные ли условия сейчас для роста бобовых? -"

