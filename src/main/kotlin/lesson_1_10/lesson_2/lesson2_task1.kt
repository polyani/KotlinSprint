package lesson_1_10.lesson_2

fun main(){
    val allStudent = 4
    val student1 = 3f
    val student2 = 4f
    val student3 = 3f
    val student4 = 5f
    var avgResult: Float

    avgResult = (student1 + student2 + student3 + student4) / 4
    println(String.format("%.2f", avgResult))

}