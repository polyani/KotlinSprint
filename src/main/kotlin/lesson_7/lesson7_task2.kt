package lesson_7

fun main() {
    var pinCode: Int = (1000..9999).random()
    println("Ваш код авторизации: $pinCode")
    print("Введите пин-код для авторизации: ")
    var inPinCode = readln().toInt()
    if (pinCode == inPinCode) {
        println("Введен правильный пин-код")
    } else {
        do {
            println("Пин-код ошибочен!")
            pinCode = (1000..9999).random()
            println("Ваш новый код авторизации: $pinCode")
            print("Введите пин-код для авторизации: ")
            inPinCode = readln().toInt()
        } while (inPinCode != pinCode)
        println("Введен правильный пин-код")
    }
}

//
//fun main() {
//    var pinCode = (1000..9999).random()
//    println("Ваш код авторизации: $pinCode")
//    print("\nВведите ваш пин-код для авторизации: ")
//    var inPinCode = readln().toInt()
//
//    while (true) {
//        if (inPinCode == pinCode) {
//            println("Введен правильный пин-код")
//            break
//        }
//        println("Пин-код ошибочен! Введите правильный: ")
//        pinCode = (1000..9999).random()
//        println("Ваш код авторизации: $pinCode")
//        inPinCode = readln().toInt()
//    }
//}