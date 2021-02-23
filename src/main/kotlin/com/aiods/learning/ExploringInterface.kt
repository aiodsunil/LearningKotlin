package com.aiods.learning

interface Item{
    fun isDelivered():Boolean
    val itemId:String
    fun itemStatus()="Open"
}

open class  OrderItem(number:String) : Item{
    override fun isDelivered()=false

    override val itemId= "123"

    init {
          if (number==="1234") throw CustomEx()
    }
}

class OrderDelivered: OrderItem("1234"),Item {
    override fun isDelivered()=true

    override val itemId= "321"
}

class CustomEx : Throwable()

fun main() {
  println("Hello Kotlin Extension".upperCase())
}

fun String.upperCase(): String {
    return  this.toUpperCase()
}