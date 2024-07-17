package lesson_1

fun main() {
//    val sumOrders: Int = 75
//    val expGratitude: String = "Спасибо, за Ваш выбор! Надеемся на дальнейшее сотрудничество."
//    val amtWorkers: UInt = 1999U
//    var amtWorkers: UInt = 2000U // обьявить изм.перем.
    val fstFlight: String = "1961"
    var flHour: String = "09"
    var flMinute: String = "07"

//    println(sumOrders)
//    println(expGratitude)

//    --amtWorkers //декремент
//    println("Ваши $amtWorkers сотрудников.")
    println("""
        Год полёта - $fstFlight
        Час старта - $flHour
        Минута старта - $flMinute
    """.trimIndent())

    flHour = "10"
    flMinute = "55"

    println("\nВремя посадки - $flHour:$flMinute")
}