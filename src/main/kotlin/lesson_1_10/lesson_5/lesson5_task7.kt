package lesson_1_10.lesson_5

fun main() {
    println("Расстояние поездки в километрах - ")
    val tripDistance: Float = readln().toFloat()
    println("Расход топлива в литрах на 100 км. - ")
    val fuelСonsumption: Float = readln().toFloat()
    println("Цена топлива  за 1 литр")
    val currentCostGas = readln().toFloat()

    val totalGas: Float = (tripDistance * fuelСonsumption) / 100
    val totalCostGas = totalGas * currentCostGas

    println("потребуется - %.2f литров топлива".format(totalGas))
    println("стоимость топлива для поездки - %.2f рублей".format(totalCostGas))
}
