package lesson_1_10.lesson_7

fun main() {

    val CharList = ('a'..'z')
    val NumbersList = (0..9)
    var resultPass: String = ""

    for (i in 1..3) {
        resultPass = resultPass + CharList.random().toString() + NumbersList.random().toString()
    }
    print(resultPass)
}