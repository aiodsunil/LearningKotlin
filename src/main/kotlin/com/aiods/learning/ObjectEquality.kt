package com.aiods.learning

fun main() {

   // Type           java      Kotlin
   // Reference      ==        === ,negated(!==)
   // value          equals     == or equals negated(!=)
    //equals method in Any class in Kotlin




//    val int1 = 11
//    val int2 = 12
//
//    println(int1 == int2)        // true
//    println(int1.equals(int2))   // true
//    println(int1 === int2)       // true

    val department1 = Department("IT")
    val department2 = Department("IT")

//    println(department1 == department2)      //false
//    println(department1 == department2) //false  different object in case of normal class and don't not compare the content but Data class return true
//    println(department1 === department2)     //false
//
    println(department1.name == department2.name)       //true
    println(department1.name.equals(department2.name))  //true
    println(department1.name === department2.name)      //true
}

 data class Department (val name: String)
