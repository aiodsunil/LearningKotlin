package com.aiods.learning

fun main() {

//    val  myBox=Box<Int>()
//    myBox.display(123)
//    val carBox=Box<Car>()
//    carBox.display(Car())

//    val dictionary= hashMapOf<String,String>()

    val chef= Chef<Apple1>()
    chef.cook(Apple1())
}

class Box<T:Fruit1,U:Vegetable>{
    fun display(item: T){
        println(item)
    }
}
class  Car1{

}

abstract class Fruit1{
    abstract fun peel()
}

class Apple1 : Fruit1(){
    override fun peel() {
       println("Peeling the apple")
    }

}
class  Chef<T:Fruit1>{
     fun  cook(item: T){
         item.peel()
     }
}