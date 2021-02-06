package com.aiods.learning

data class Employee(val name: String,val age: Int){



}

fun main() {

    val emp1=Employee("max",33)
    val emp2=emp1.copy()
val ab=emp1===emp2
    println(ab)


}


