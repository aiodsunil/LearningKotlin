package com.aiods.learning

fun main() {
    println("Hello PF")

    //First Class Functions
    //No Side effect
    //Lazy Evaluation
    //statelessness
    //immutable  Data
    //Pure Functions
    val colors= listOf("Red","Green","Blue","Black","White")

    //var upperCaseColors= mutableListOf<String>()

//    for ( color in colors){
//        upperCaseColors.add(color.toUpperCase())
//
//    }
//    for (colorUpperCase in upperCaseColors){
//        println(colorUpperCase)
//    }

    //colors.map { it.toUpperCase() }.forEach { println(it) }
    colors.filter { it.startsWith("B") }.forEach { println(it) }



}