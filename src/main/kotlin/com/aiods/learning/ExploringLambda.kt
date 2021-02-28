package com.aiods.learning

fun main() {
    hello(arrayListOf("Sunil","Max","Rabi")) { name: String -> println("Hello $name") }
}

fun hello(input:ArrayList<String>,output:(String)->Unit){

    for (name in input){
        output(name)
    }
}
