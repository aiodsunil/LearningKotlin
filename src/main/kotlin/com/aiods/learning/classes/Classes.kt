package com.aiods.learning.classes

data class Employee(val name: String,val age: Int,var address:String=""){

    var surName:String?=null

    fun toUpperCase(){
        surName?.toUpperCase() ?: ""
    }

}

fun main() {

    val emp1=Employee("max",33)
    val emp2=Employee("mat",34)
    val emp= if (emp1.age>emp2.age) emp1 else  emp2
//    val emp= compare(emp1,emp2)

    println("${emp.name},${emp.age}")
}

//fun compare(emp1: Employee, emp2: Employee) = if (emp1.age>emp2.age) emp1 else  emp2

