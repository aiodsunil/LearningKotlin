package com.aiods.learning.classes

data class Employee(val name: String,val age: Int,var address:String=""){

    var letter:String?=null

    fun lastWord(s:String)=s.takeLast(1)

    fun convert():String{
        return letter?.let { lastWord(it) } ?: "test"
    }


}

fun main() {

    val emp1=Employee("max",33)

     println(emp1.convert())
    emp1.letter="Hello World"
    println(emp1.convert())


}


