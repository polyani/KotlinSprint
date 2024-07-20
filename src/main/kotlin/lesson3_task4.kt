package lesson_3

fun main() {
    var whereFrom = "E2"
    var whereTo = "E4"
    var numberStep = 1
    val result1 = "ход №$numberStep - из $whereFrom в $whereTo"
    println(result1)

    numberStep = ++numberStep
    whereFrom = "E4"
    whereTo = "D5"
    println("ход №$numberStep - из $whereFrom в $whereTo")

    numberStep = ++numberStep
    whereFrom = "D2"
    whereTo = "D3"
    println("ход №$numberStep - из $whereFrom в $whereTo")

}