package lesson_1_10.lesson_1

fun main(){

    val totalSecond = 6480
    val fligtHour = totalSecond / ONE_HOUR // вывести кол-во целых часов, дробная часть будет отброшена
    val fligtMinutes = totalSecond / ONE_MINUTE % ONE_MINUTE
    val fligtSeconds = totalSecond % ONE_MINUTE

   println(String.format("%02d:%02d:%02d", fligtHour, fligtMinutes, fligtSeconds))
}

const val ONE_HOUR = 3600
const val ONE_MINUTE = 60
const val ONE_SECOND = 1