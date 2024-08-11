package lesson_8

fun main(){
    val intArray = intArrayOf(12, 120, 240, 360, 480, 510, 65)
    var sumViews = 0
    for (i in 0 until intArray.size)
        sumViews += intArray[i]
    println(sumViews)

}