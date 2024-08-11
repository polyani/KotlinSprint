package lesson_2

import kotlin.math.*


fun main(){

    val deposit = 70000
    val yearPercent = 16.7
    val depositPeriod = 20
    val totalAmount: Double
    totalAmount = (1 + (yearPercent/100)).pow(depositPeriod) * deposit

    println("%.3f".format(totalAmount))

}