package lesson_1_10.lesson_2

fun main(){
    val Employees = 50            // кол-во постоянных сотрудников
    val salaryEmployees = 30000  // зарплата одного пост. сотрудника
    var sumSalEmployees: Int     // сумма зп пост. сотрудников
    val Trainee = 30            // кол-во стажеров
    val salaryTrainee = 20000   // зп одного стражера
    val sumSalTrainee: Int      // сумма зп стажеров
    val allSalary: Int          // общая зарплата компании(сотрудники + стажёры)
    val allAvgSalary: Int       // средняя з/п всех (сотр + стажеры)

        /* вычисления по условиям задачи
        – Расходы на выплату зарплаты постоянных сотрудников;
        – Общие расходы по ЗП после прихода стажеров;
        – Среднюю ЗП одного сотрудника после устройства стажеров.
        */
    sumSalEmployees = Employees * salaryEmployees
    sumSalTrainee = Trainee * salaryTrainee
    allSalary = sumSalEmployees + sumSalTrainee
    allAvgSalary = (sumSalEmployees + sumSalTrainee) / (Employees + Trainee)

     // вывод в консоль результатов
    println("Сумма зарплаты постоянных сотрудников - $sumSalEmployees")
    println("Сумма зарплаты всех сотрудников - $allSalary")
    println("Средняя з/п в компании после выхода на работу стажёров - $allAvgSalary")
}