package com.aiods.learning

class Car{
    private val engine = Engine()
    var speed=100
    fun drive(){
        engine.run()
        println("Driving at speed $speed")
    }

   private inner class Engine{
        val rmp=300
        fun  run(){
            println(" Engine is running at $rmp rmp")

            speed=150
           // drive()
        }
    }
}

fun main() {
    val myCar= Car()
    myCar.drive()
}