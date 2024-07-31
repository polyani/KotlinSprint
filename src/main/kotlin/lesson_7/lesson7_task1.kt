package lesson_7


fun main() {

    val CharList = ('a'..'z').joinToString("")

    val n = 9

    val NumbersList = (0..n).joinToString("")//.toList()

    val resulrPass: MutableList<String> = arrayListOf() //результирующий пароль

    var passChr = CharList.random().toString()
    var passNum = NumbersList.random().toString()

    for (i in 1..6) {

        if (i % 2 > 0) {
            resulrPass.add(passChr)
            passChr = CharList.random().toString()
        } else {
            resulrPass.add(passNum)
            passNum = NumbersList.random().toString()
        }

    }
//     resulrPass.forEach { print(it) } // вариант вывода массива строкой без запятых
    print(resulrPass.joinToString(""))
}