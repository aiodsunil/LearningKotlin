package com.aiods.learning.classes

data class Employee(val name: String,val age: Int,var address:String=""){

}

fun main() {

    val employee=Employee("test",33)

    val(name,age,address)=employee
   // val emp2=employee.copy(age = 34)

    println("name $name,age $age")


}