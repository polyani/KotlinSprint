package lesson_1_10.lesson_2

fun main(){
    val hourDepart: Int = 9
    var minuteDepart: Int = 39
    var timeTravel: Int = 457
    var timeArrival: Int = 0

    minuteDepart = START_DAY + (hourDepart * ONE_HOUR_MINUTE) + minuteDepart // время отправления от начала суток в минутах
    timeArrival = minuteDepart + timeTravel
    val timeArrivalHour: Int = timeArrival / ONE_HOUR_MINUTE
    val timeArrivalMinute: Int = timeArrival - timeArrivalHour * ONE_HOUR_MINUTE


    println("$timeArrivalHour:$timeArrivalMinute")
        // lesson_1_10.lesson_2.Lesson2_task3Kt
        // 17:16
        // Process finished with exit code 0
}

const val START_DAY = 0
const val ONE_DAY_MINUTE = 1440 // кол-во минут в сутках
const val ONE_HOUR_MINUTE = 60 // кол-во минут в часе
const val ONE_HOUR_SEC = 3600 // кол-во секунд в часе
const val ONE_MINUTE_SEC = 60 // кол-во секунд в минуте
const val ONE_SECOND = 1