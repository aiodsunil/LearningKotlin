package com.aiods.learning

import java.io.FileInputStream

fun main() {
   // Thread.sleep(200)
    //println(7/0)
   var result= try {
        divide(7,0)

    }catch (e:ArithmeticException){
     println(e)
       0
    }
 println(result)

}

fun divide(a: Int, b: Int): Int? {
    return a / b
}

fun readFile(){
    val file=FileInputStream("input.txt")
    file.use {

    }
}