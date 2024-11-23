package lesson_1_10.lesson_4

fun main(){
    print("Введите \"true\" при незначительных повреждениях корабля, если повреждений нет - нажмите enter: ")
    val damageShip: Boolean = readlnOrNull().toBoolean()
    print("Введите количество экипажа: ")
    val numberOfCrew: Int = readln().toInt()
    print("Введите количество ящиков провизии: ")
    val boxFood: Int = readln().toInt()
    print("Введите \"true\" при благоприятной погоде, в противном случае - нажмите enter: ")
    val goodWeather: Boolean = readlnOrNull().toBoolean()

    val result = (damageShip == false &&
                 numberOfCrew in MIN_NUMBER_OF_CREW ..MAX_NUMBER_OF_CREW &&
                 boxFood > BOX_OF_FOOD) ||
                 (damageShip == true &&
                 numberOfCrew == MAX_NUMBER_OF_CREW &&
                 boxFood >= BOX_OF_FOOD &&
                 goodWeather == true)

    if (result == true){println("Плавание возможно")}
            else println("Плавание не возможно")

}

const val MIN_NUMBER_OF_CREW = 55
const val MAX_NUMBER_OF_CREW = 70
const val BOX_OF_FOOD = 50

