package lesson_1

fun main(){
    val secondAll = 6480
    val hour = secondAll / 3600
    val minutes = secondAll / 60 % 60
    val seconds = secondAll % 60

    println("0$hour:$minutes:0$seconds")
}