package lesson_1_10.lesson_3

fun main(){
    val resultIn = "D2-D4;0"
    val parts = resultIn.split("-", ";")
    val whereFrom = parts[0]
    val whereTo = parts[1]
    val numberStep = parts[2]

    println("Откуда - " + "$whereFrom\n" + "Куда - " + "$whereTo\n" + "Ход № - " + "$numberStep")

}