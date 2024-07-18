package lesson_1

fun main(){
    val oneHour = 3_600
    val oneMinute = 60
    val oneSecond = 1
    val totalSecond = 6480
    val fligtHour = totalSecond / oneHour // вывести кол-во целых часов, дробная часть будет отброшена
    val fligtMinutes = totalSecond / oneMinute % oneMinute
    val fligtSeconds = totalSecond % oneMinute

   println(String.format("%02d:%02d:%02d", fligtHour, fligtMinutes, fligtSeconds))
}