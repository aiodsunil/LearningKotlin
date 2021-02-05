package com.aiods.learning

import java.util.function.Consumer

fun main() {

   val z= sum(x=5)

    println("sum of x and y is : $z")

  //  lambdaParam("Sunil", ::println)
}




fun sum(x: Int, y: Int=8)= x + y


fun lambdaParam(input: String, action: (String)->Unit): Unit {
    action(input)
}
