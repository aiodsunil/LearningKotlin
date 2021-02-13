package com.aiods.learning

fun main() {

    val names = listOf("Sunil", "Anil", "Abhi","Sushil")
//    for (name in names) {
//        println(name)
//    }

//    for (x in 0..10) println(x) // Prints 0 through 10 (inclusive)
//    for (x in 0 until 10) println(x) // Prints 0 through 9
//
//    for (x in 0 until 10 step 2) println(x) // Prints 0, 2, 4, 6, 8
//    for (x in 10 downTo 0 step 2) println(x) // Prints 10, 8, 6, 4, 2, 0
    //val numbers = (0..9).toList()
   // numbers.forEach(::println)
//    for ((index, value) in names.withIndex()) {
//        println("$index: $value")
//    }
//
    var x = 0
//    while (x < 10) {
//        println(x)
//        x++ // Same as x += 1
//    }
    do {
        println(x)
        x++ // Same as x += 1
    }while (x < 10)

}