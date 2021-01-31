package com.aiods.learning

fun main() {
    val  doubleType=33.75

    println("doubleType is ${doubleType::class.qualifiedName}")
    println("doubleType in java ${doubleType.javaClass}")

    val intTye=123

    println("intTye is ${intTye::class.qualifiedName}")
    println("intTye in java ${intTye::class.java}")

    val longType=3344L
    val floatType=343.54f
}