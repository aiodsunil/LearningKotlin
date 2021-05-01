package com.aiods.learning

fun main() {
    val numbers = mutableListOf("one", "two", "three")
    numbers
        .also { println("The list elements before adding new one: $it") }
        .add("four")
        .also { println("The list elements after adding new one: $it") }
}