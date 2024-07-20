package lesson_3

fun main(){
    val userName = "Sergey"
    var welcomePrint = "Good morning"
    println("$welcomePrint $userName")
    welcomePrint = "Good evening"
    println("$welcomePrint $userName")

}

//import java.sql.Timestamp
//
//fun main(){
//    print("Пожалуста введите имя - ")
//    val nameUser = readln()
//    val greetinMoning = "Доброе утро $nameUser"
//    val greetinEvening = "Добрый вечер $nameUser"
//    val currentTimeMillis = System.currentTimeMillis()
//    val timeStamp = Timestamp(currentTimeMillis).toString()
//    val curTime = timeStamp.substring(11,13).toInt()
//    if(curTime < 12)
//    println("$greetinMoning")
//    else
//    println("$greetinEvening")
//
//}

