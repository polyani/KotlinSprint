package lesson_1_10.lesson_1

fun main() {

    val fstFlight: String = "1961"
    var flHour: String = "09"
    var flMinute: String = "07"

    println("""
        Год полёта - $fstFlight
        Час старта - $flHour
        Минута старта - $flMinute
    """.trimIndent())

    flHour = "10"
    flMinute = "55"

    println("\nВремя посадки - $flHour:$flMinute")
}