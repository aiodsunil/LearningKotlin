package com.aiods.learning

fun main() {


    var name: String? ="sunil"

    var length=  name?.length?: 3 //?: elvis operator

     println("name length is $length")

}