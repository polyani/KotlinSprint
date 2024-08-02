package lesson_6

fun main() {
    var randomNumber1 = (1..9).random()
    var randomNumber2 = (1..9).random()
    var controlSum = randomNumber1 + randomNumber2
    var sumForInput = 0
    print("Вам даётся три попытки для подтверждения, что Вы не бот\n")

    for(i in 3 downTo 1)
    {
        print("Сложите два числа, $randomNumber1 и $randomNumber2 = ")
        sumForInput = readln().toInt()

        if (controlSum == sumForInput)
        {
            println("Добро пожаловать!")
            break
        }
        else if (i==1)
        {println("Доступ запрещен")}

    }
}