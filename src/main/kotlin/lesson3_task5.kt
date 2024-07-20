package lesson_3

fun main(){
    val resultIn = "D2-D4;0"
    val parts = resultIn.split("-", ";")
    val whereFrom = parts.component1()
    val whereTo = parts.component2()
    val numberStep = parts.component3()

    println("Откуда - " + "$whereFrom\n" + "Куда - " + "$whereTo\n" + "Ход № - " + "$numberStep")

}