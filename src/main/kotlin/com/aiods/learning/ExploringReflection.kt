package com.aiods.learning

fun isEven(x: Int) = x%2==0

fun main() {
    val myList= listOf(1,2,3,4,5,6,7)
    myList.filter ( ::isEven ).forEach (::println)
}