package com.aiods.learning

import java.util.*

fun main() {

    var result:Any

    val random =  Random().nextInt(3)

    result = if (random == 1) 345.5 else "Hello";

    result = if (result is Double)  result + 4 else result as String

   println("Result is $result")
}

