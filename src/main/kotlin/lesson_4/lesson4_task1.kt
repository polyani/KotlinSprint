package lesson_4

fun main(){
    val todayReservTable = 13
    val tomorReservTable = 9

    val todayVacationTable: Boolean
    todayVacationTable = ALL_TABLE > todayReservTable
    val tomorVacationTable: Boolean
    tomorVacationTable = ALL_TABLE > tomorReservTable

    print("\nДоступность столиков на сегодня - $todayVacationTable,\n" +
            "Доступность столиков на завтра - $tomorVacationTable.\n"
    )

}

const val ALL_TABLE = 13