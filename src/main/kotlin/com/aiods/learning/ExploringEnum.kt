package com.aiods.learning

enum class  Color(val timeUsed: Int) {
    RED(1),
    GREEN(2),
    BLUE(3)
}

fun main() {
//    decide(Color.RED)
    println(Color.GREEN.ordinal)
    val value=Color.GREEN.timeUsed
    println("value is $value")
}

fun  decide(color: Color){
    when(color){
        Color.BLUE -> println("blue")
        Color.GREEN -> println("green")
        Color.RED -> println("red")
    }
}