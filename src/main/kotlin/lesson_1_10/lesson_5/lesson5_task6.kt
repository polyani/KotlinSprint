package lesson_1_10.lesson_5

import kotlin.math.pow

fun main() {
    println("Введите массу тела(кг) - ")
    val weightBody = readln().toFloat()
    println("Введите рост(см) - ")
    val growth = readln().toFloat() / 100
    val exponentFloat = 2
    val growthExponent = growth.pow(exponentFloat)
    val imt = weightBody / growthExponent

    when (imt) {
        imt -> {
            when {
                imt < 18.5 -> {
                    println("%.2f".format(imt) + " - ИМТ < 18.5: Недостаточная масса тела")
                }

                imt >= 18.5 && imt < 25.0 -> {
                    println("%.2f".format(imt) + " - 18.5 ≤ ИМТ < 25: Нормальная масса тела")
                }

                imt >= 25.0 && imt < 30.0 -> {
                    println("%.2f".format(imt) + " - 25 ≤ ИМТ < 30: Избыточная масса тела")
                }

                else -> {
                    println("%.2f".format(imt) + " - ИМТ ≥ 30: Ожирение")
                }
            }
        }
    }
}