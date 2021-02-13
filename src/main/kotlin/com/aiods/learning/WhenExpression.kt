package com.aiods.learning

fun main() {

    val x = 1

    Unit

    val z = when (x) {
        1 -> 1
        2 -> println("x == 2")
        else -> { // Note the block
            println("x is neither 1 nor 2")
        }
    }

   // z.toString().forEach { i -> println(i) }
}