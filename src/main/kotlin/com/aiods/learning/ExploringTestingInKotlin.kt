package com.aiods.learning

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.lang.ArithmeticException
import kotlin.test.assertEquals

class ExploringTestingInKotlin {

    fun sum(x: Int, y: Int): Int {
        if (y===0) throw ArithmeticException()
       return 0
    }
}

class SumTest{

    @Test
    fun testSum(){
        assertEquals(0,ExploringTestingInKotlin().sum(3,9))
    }

    @Test
    fun handleSumException(){
        Assertions.assertThrows(ArithmeticException::class.java){
            ExploringTestingInKotlin().sum(3,0)
        }
    }

}
