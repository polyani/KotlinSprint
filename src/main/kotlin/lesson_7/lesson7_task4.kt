package lesson_7

fun main(){
    print("Введите требуемое время в секундах - ")
    var inTime: Int = readln().toInt()

    for( i in inTime downTo  1)
    {
        println("До истечения указанного времени осталось: $i")
        Thread.sleep(1000)
    }
    println("Время вышло.")
}