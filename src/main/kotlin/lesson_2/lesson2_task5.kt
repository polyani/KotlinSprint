package lesson_2

// import kotlin.math.*

fun main(){

    val deposit = 70000 // первоначальная сумма
    var yearPercent: Float = 16.7f // процентная ставка
    val depositPeriod = 20 // срок вклада в годах
    var totalAmount: Float // итоговая сумма
    var result: Float = (1 + (16.7/100)).pow(20)

    totalAmount = (deposit * result)

    println(totalAmount)

    // формула сумма = x * (1 + m/100) в степени n
    // x - которую положили на вклад
    // м - годовая процентная ставка
    // n - срок действия вклада
}
