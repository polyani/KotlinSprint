package lesson_3

fun main(){
    val firstName = "Татьяна"
    val surName = "Сергеевна"
    val lastName = "Андреева"
    var age = 20
    println("$firstName $surName $lastName, $AGE_FULL, $SINGLE ")
    age = 22
    println("$firstName $surName $lastName, $AGE_FULL, $MARRIED ")
}
const val AGE_FULL = "Полных лет"
const val SINGLE  = "Не замужем"
const val MARRIED = "Замужем"