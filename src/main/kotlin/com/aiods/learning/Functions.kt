package com.aiods.learning

import java.util.function.Consumer

fun main() {

//   val z= sum(y=6,x=5)
//
//    println("sum of x and y is : $z")

    lambdaParam("Sunil", ::println)
}

fun lambdaParam(input: String, action: (String)->Unit): Unit {
    action(input)
}

//syntax
fun sum(x: Int, y: Int): Int {
    fun hello(): Unit {
       println("Hello")
    }
    hello()
   return  x + y
}
