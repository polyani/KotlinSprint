package lesson_2

fun main(){

    val cristalRuda = 7f
    val ferrRuda = 11f
    var baff: Float = 0f
    var baffCristalRuda: Float = 0f
    var baffferrRuda: Float = 0f

    baff = 20f / 100f
    baffCristalRuda = cristalRuda * baff
    baffferrRuda = ferrRuda * baff

    println(String.format("%.0f", baffCristalRuda))
    println(String.format("%.0f", baffferrRuda))

}