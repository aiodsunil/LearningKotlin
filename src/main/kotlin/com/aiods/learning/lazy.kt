package com.aiods.learning

import kotlin.random.Random

fun main() {
    val someLargeVariable:String by lazy {
        "Hello Lazy variable"
    }

    val rand= Random.nextInt()
    if (rand % 2==0)
        println(someLargeVariable)
}