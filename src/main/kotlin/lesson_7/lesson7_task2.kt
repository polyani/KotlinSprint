package lesson_7

fun main() {
    val pinCode = (1000..9999).random()
    println("Ваш код авторизации: $pinCode")
    print("\nВведите ваш пин-код для авторизации: ")
    var inPinCode = readln().toInt()

    while (true) {
        if (inPinCode == pinCode) {
            println("Введен правильный пин-код")
            break
        }
        print("Пин-код ошибочен! Введите правильный: ")
        inPinCode = readln().toInt()
    }
}