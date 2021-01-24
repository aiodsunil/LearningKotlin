package com.aiods.learning;

import java.util.Random;

public class TypeCast {
    public static void main(String[] args) {
        Object result;

        int random = new Random().nextInt(3);

        if (random == 1) {
            result = 345.5;
        } else {
            result = "Hello";
        }

        if (result instanceof Double) {
            result = (Double)result + 4;
        } else {
            String temp = (String) result;
            result = temp;
        }

        System.out.println("Result is " + result);
    }
}
