package lesson_2

fun main(){
    val allStudent = 4
    val student1 = 3
    val student2 = 4
    val student3 = 3
    val student4: Float = 5f
    var avgResult: Float

    avgResult = (student1+student2+student3+student4) / 4
    println(String.format("%.2f", avgResult))

}