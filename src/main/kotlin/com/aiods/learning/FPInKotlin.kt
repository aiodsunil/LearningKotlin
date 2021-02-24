package com.aiods.learning

fun main() {
   // println("Hello PF")

    //First Class Functions
    //No Side effect
    //Lazy Evaluation
    //statelessness
    //immutable  Data
    //Pure Functions
    val colors= listOf("Red","Green","Blue","Black","White")

    //colors.flatMap { if (it.startsWith("B")) listOf(it,it) else listOf(it) }.forEach { println(it)}

    //colors.reduce { result, value -> "$result,$value"}.forEach { print(it) }

    val numbers=colors.map { it.length }
   // numbers.forEach { println(it) }

//    println(numbers.sum())
//    println(numbers.average())
//    println(numbers.count())

  //println(numbers.fold(0){result,value->result+value})

    val myMap= mapOf(1 to "one",2 to "two",3 to "three")
 // myMap.filter { (k,v)->v.startsWith("t") }.forEach{(k,v)->println("$k,$v")}
    myMap.filter { (k,v) ->v.startsWith("t") }.forEach{x->println("${x.value},${x.key}")}


}