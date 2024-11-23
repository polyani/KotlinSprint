package lesson_1_10.lesson_4

fun main(){
    var inWt = 20
    var inVolume = 80

//    inWt = 50
//    inVolume = 100

    println("""
        Груз с весом ${inWt} и объёмом ${inVolume} соответствует
        категории ${LOADING_CATEGORY}:${(inWt > MIN_WT) && (inWt <= MAX_WT) && (inVolume < MAX_VOLUME)}
    """.trimIndent())
}

const val MIN_WT = 35
const val MAX_WT = 100
const val MAX_VOLUME = 100
const val LOADING_CATEGORY = "'Average'"