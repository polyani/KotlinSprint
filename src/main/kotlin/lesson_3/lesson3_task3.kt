package lesson_3

fun main() {
    print("Введите число - ")
    val number = readln().toShort()
    var counter = 1

    println(
        """
           $number * $counter = ${number * counter}
           $number * ${++counter} = ${number * counter}
           $number * ${++counter} = ${number * counter}
           $number * ${++counter} = ${number * counter}
           $number * ${++counter} = ${number * counter}
           $number * ${++counter} = ${number * counter}
           $number * ${++counter} = ${number * counter}
           $number * ${++counter} = ${number * counter}
           $number * ${++counter} = ${number * counter}
           $number * ${++counter} = ${number * counter}
          """.trimIndent()
    )
}
